package calc.two;

import java.util.List;

public class Calculor {
    public Double operation(List<Opertaion> opertaions) {

        return opertaions == null ? 0.0 : opertaions.stream()
                .map(opertaion -> opertaion.getOperation())
                .reduce(0.0, (operationOne, operationTwo) -> operationOne + operationTwo);
    }
}
