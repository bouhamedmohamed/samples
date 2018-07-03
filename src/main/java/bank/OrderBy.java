package bank;

import java.util.function.Function;

public enum OrderBy {
    INC("inc", (sordedDiff) -> sordedDiff),
    DESC("desc", (sordedDiff) -> -sordedDiff);


    private final String order;
    private final Function<Integer, Integer> function;

    OrderBy(String order, Function<Integer, Integer> function) {
        this.order = order;
        this.function = function;
    }

    public Integer apply(int number) {
        return function.apply(number);
    }
}
