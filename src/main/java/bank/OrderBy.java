package bank;

import java.util.function.Function;

public enum OrderBy {
    INC("inc", (sordedOder) -> sordedOder),
    DESC("desc", (sordedOrder) -> -sordedOrder);


    private final String symbol;
    private final Function<Integer, Integer> orderFunction;

    OrderBy(String symbol, Function<Integer, Integer> orderFunction) {
        this.symbol = symbol;
        this.orderFunction = orderFunction;
    }

    public Integer apply(int sortedOrder) {
        return orderFunction.apply(sortedOrder);
    }
}
