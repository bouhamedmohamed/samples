package Calculatrice;

import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

public enum Operators implements DoubleBinaryOperator {
    ADD("+", (a, b) -> a + b),
    MUL("*", (a, b) -> a * b),
    SOU("-", (a, b) -> a - b),
    DIV("/", (a, b) -> {
        if (b != 0)
            return a / b;
        throw new IllegalArgumentException("invalid division by zero");
    });

    public String getValue() {
        return value;
    }

    public DoubleBinaryOperator getOperation() {
        return operation;
    }

    private String value;
    private DoubleBinaryOperator operation;

    public static Double calculate(String symbol, int a, int b) {
        return Arrays.stream(Operators.values())
                .filter(operators -> operators.getValue().equals(symbol))
                .findFirst()
                .map(operators -> operators.applyAsDouble(a,b))
                .orElseThrow(() ->new IllegalArgumentException("Invalid Operation"));
    }

    Operators(String value, DoubleBinaryOperator operation) {
        this.value = value;
        this.operation = operation;
    }


    @Override
    public double applyAsDouble(double left, double right) {
        return operation.applyAsDouble(left, right);
    }
}