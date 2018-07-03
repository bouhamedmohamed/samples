package fizzbuzz;

import java.util.Arrays;

public enum FizzBuzzRules {
    FIZZBUZZ("fizzbuzz", 15), BUZZ("buzz", 5), FIZZ("fizz", 3);
    private String message;
    private int number;

    public String getMessage() {
        return message;
    }

    public int getNumber() {
        return number;
    }

    FizzBuzzRules(String message, int number) {
        this.message = message;
        this.number = number;
    }

    public static String calculateGameValue(int number) {
        return Arrays.stream(FizzBuzzRules.values())
                .filter(fizzBuzzElement -> fizzBuzzElement.isMultipleOf(number))
                .map(fizzBuzzRules -> fizzBuzzRules.getMessage())
                .findFirst()
                .orElseGet(() -> String.valueOf(number));
    }

    private boolean isMultipleOf(int number) {
        return number % getNumber()==0;
    }


}