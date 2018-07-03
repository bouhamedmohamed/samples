package bank;

public class BankAccount {

    private final double solde;
    private final String login;
    private final int yearOfCreation;

    public BankAccount(double solde, String login, int yearOfCreation) {
        this.solde = solde;
        this.login = login;
        this.yearOfCreation = yearOfCreation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankAccount that = (BankAccount) o;

        return login.equals(that.login);

    }

    @Override
    public int hashCode() {
        return login.hashCode();
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "solde=" + solde +
                ", login='" + login + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                '}';
    }


    public int compareToByDate(BankAccount bankAccount) {
        return new Integer(yearOfCreation).compareTo(bankAccount.yearOfCreation);
    }

    public int compareToBySolde(BankAccount bankAccount) {
        return new Double(solde).compareTo(bankAccount.solde);
    }

    public int compareToByLogin(BankAccount bankAccountTwo) {
        return login.compareTo(bankAccountTwo.login);
    }
}
