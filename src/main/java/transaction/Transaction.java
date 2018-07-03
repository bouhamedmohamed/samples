package transaction;

import java.time.LocalDate;

public class Transaction {
    private final String nameTreader;
    private final double montant;
    private final LocalDate localDate;

    public Transaction(String nameTreader, double montant, LocalDate localDate) {
        this.nameTreader = nameTreader;
        this.montant = montant;
        this.localDate = localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transaction that = (Transaction) o;

        if (nameTreader != null ? !nameTreader.equals(that.nameTreader) : that.nameTreader != null) return false;
        return localDate != null ? localDate.equals(that.localDate) : that.localDate == null;

    }

    @Override
    public int hashCode() {
        int result = nameTreader != null ? nameTreader.hashCode() : 0;
        result = 31 * result + (localDate != null ? localDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "nameTreader='" + nameTreader + '\'' +
                ", montant=" + montant +
                ", localDate=" + localDate +
                '}';
    }

    public double slowerThan(Transaction transaction) {
        return this.montant - transaction.montant;
    }


    public int compareName(Transaction transactionTwo) {
        return nameTreader.compareTo(transactionTwo.nameTreader);
    }

    public int compareDate(Transaction transactionTwo) {
        return localDate.compareTo(transactionTwo.localDate);
    }
}
