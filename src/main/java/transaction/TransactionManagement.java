package transaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.sort;

public class TransactionManagement {
    List<Transaction> allTransaction = new ArrayList<>();


    public List<Transaction> getAll() {
        return allTransaction;
    }

    public void add(Transaction transaction) {
        allTransaction.add(transaction);
    }

    public List<Transaction> sort(Comparator sortBy) {
        Collections.sort(allTransaction, sortBy);
        return allTransaction;
    }
    public static Comparator<Transaction> sortByMontant() {
        return new Comparator<Transaction>() {
            @Override
            public int compare(Transaction transactionOne, Transaction transactionTwo) {
                return (int) transactionOne.slowerThan(transactionTwo);
            }
        };
    }

    public static Comparator<Transaction> sortByName() {
        return new Comparator<Transaction>() {
            @Override
            public int compare(Transaction transactionOne, Transaction transactionTwo) {
                return (int) transactionOne.compareName(transactionTwo);
            }
        };
    }

    public static Comparator<Transaction> sortDate() {
        return new Comparator<Transaction>() {
            @Override
            public int compare(Transaction transactionOne, Transaction transactionTwo) {
                return (int) transactionOne.compareDate(transactionTwo);
            }
        };
    }
}
