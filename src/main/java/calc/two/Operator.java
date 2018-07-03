package calc.two;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.DoubleFunction;

public enum Operator implements DoubleFunction {
    DEPOSIT("deposit", a -> a), WITHDRAW("withdrawal", a -> -a);


    private final String symbol;
    private DoubleFunction operation;

    Operator(String symbol, DoubleFunction operation) {
        this.symbol = symbol;
        this.operation = operation;
    }

    public Double apply(double amount) {
        return (Double) operation.apply(amount);
    }

    static Optional<Operator> getOperator(String operatorSymbol) {
        return Arrays.stream(values())
                .filter(operator -> operator.symbol.equals(operatorSymbol))
                .findFirst();
    }
}
