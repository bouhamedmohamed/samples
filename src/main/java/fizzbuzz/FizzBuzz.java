package fizzbuzz;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FizzBuzz {


    public String calculate(int number) {

        return FizzBuzzRules.calculateGameValue(number);
    }

    public String calculateFromChain(String chain) {
        String[] games = chain.split(" ");

        return Arrays.stream(games)
                .map(game -> Integer.parseInt(game))
                .map(intGame -> calculate(intGame))
                .collect(Collectors.joining(" "));
    }
}
