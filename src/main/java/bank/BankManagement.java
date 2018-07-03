package bank;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BankManagement {
    private List<BankAccount> bankAccounts;

    public BankManagement(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    List<BankAccount> getSortedBankAccounts(Criteria criteria, OrderBy orderBy) {
        return bankAccounts.stream().sorted(getBankAccountComparator(criteria, orderBy)).collect(Collectors.toList());
    }

    private Comparator<BankAccount> getBankAccountComparator(Criteria criteria, OrderBy orderBy) {
        return (bankOne, bankTwo) -> orderBy.apply(criteria.apply(bankOne, bankTwo));
    }

    void printBankAccount(List<BankAccount> bankAccountsToPrint) {
        bankAccountsToPrint.stream().forEach(System.out::println);
    }


}
