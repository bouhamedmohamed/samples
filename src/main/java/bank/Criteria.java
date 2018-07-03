package bank;

import java.util.function.BiFunction;

public enum Criteria {
    DATE("date", (bankAccountOne, bankAccountTwo) -> bankAccountOne.compareToByDate(bankAccountTwo)),
    SOLDE("solde", (bankAccountOne, bankAccountTwo) -> bankAccountOne.compareToBySolde(bankAccountTwo)),
    LOGIN("login", (bankAccountOne, bankAccountTwo) -> bankAccountOne.compareToByLogin(bankAccountTwo));

    private final BiFunction<BankAccount, BankAccount, Integer> comparator;
    private final String symbol;

    Criteria(String Symbol, BiFunction<BankAccount, BankAccount, Integer> binaryOperator) {
        this.comparator = binaryOperator;
        this.symbol = Symbol;
    }

    public Integer apply(BankAccount bankAccountOne, BankAccount bankAccountTwo) {
        return comparator.apply(bankAccountOne, bankAccountTwo);
    }

}
