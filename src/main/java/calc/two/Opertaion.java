package calc.two;

import java.util.Comparator;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class Opertaion  {
    private final double amount;
    private static AtomicInteger totalIds=new AtomicInteger(20);
    private final int id;
    private final Operator operation;

    public Opertaion(double amount, String operation) {

        Optional<Operator> operator = Operator.getOperator(operation);
        if (!operator.isPresent()) {
            throw new RuntimeException("Impossible de creer une trasanction de ce type");
        }
        this.amount = amount;
        this.operation = operator.get();
        this.id = totalIds.getAndDecrement();
    }

    public double getOperation() {
        return operation.apply(amount);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Opertaion{" +
                "amount=" + amount +
                ", id=" + id +
                ", operation=" + operation +
                '}';
    }
}
