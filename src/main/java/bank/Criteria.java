package bank;

import java.util.function.BiFunction;

public enum Criteria {
    DATE("date", (bankAccountOne, bankAccountTwo) -> bankAccountOne.compareToByDate(bankAccountTwo)),
    SOLDE("solde", (bankAccountOne, bankAccountTwo) -> bankAccountOne.compareToBySolde(bankAccountTwo)),
    LOGIN("login", (bankAccountOne, bankAccountTwo) -> bankAccountOne.compareToByLogin(bankAccountTwo));

    private final BiFunction<BankAccount, BankAccount, Integer> sortByCriteria;
    private final String symbol;

    Criteria(String symbol, BiFunction<BankAccount, BankAccount, Integer> sortByCriteria) {
        this.sortByCriteria = sortByCriteria;
        this.symbol = symbol;
    }

    public Integer apply(BankAccount bankAccountOne, BankAccount bankAccountTwo) {
        return sortByCriteria.apply(bankAccountOne, bankAccountTwo);
    }

}
