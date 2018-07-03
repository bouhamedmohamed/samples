package bank;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class bankManagementTest {

    private BankManagement bankManagement;
    private BankAccount bankAccountOne;
    private BankAccount bankAccountTwo;
    private BankAccount bankAccountThree;
    private BankAccount bankAccountFour;

    @Before
    public void setUp() throws Exception {
        createAccounts();
        storeAccounts();
    }

    @Test
    public void should_sort_accounts_by_date_inc() throws Exception {
        List<BankAccount> sortedBankAccounts = bankManagement.getSortedBankAccounts(Criteria.DATE, OrderBy.INC);
        Assert.assertEquals(sortedBankAccounts.get(0), bankAccountFour);
        Assert.assertEquals(sortedBankAccounts.get(1), bankAccountOne);
        Assert.assertEquals(sortedBankAccounts.get(2), bankAccountTwo);
        Assert.assertEquals(sortedBankAccounts.get(3), bankAccountThree);
    }

    @Test
    public void should_sort_accounts_by_date_desc() throws Exception {
        List<BankAccount> sortedBankAccounts = bankManagement.getSortedBankAccounts(Criteria.DATE, OrderBy.DESC);
        Assert.assertEquals(sortedBankAccounts.get(0), bankAccountThree);
        Assert.assertEquals(sortedBankAccounts.get(1), bankAccountTwo);
        Assert.assertEquals(sortedBankAccounts.get(2), bankAccountOne);
        Assert.assertEquals(sortedBankAccounts.get(3), bankAccountFour);
    }


    @Test
    public void should_sort_accounts_by_solde_inc() throws Exception {
        List<BankAccount> sortedBankAccounts = bankManagement.getSortedBankAccounts(Criteria.SOLDE, OrderBy.INC);
        Assert.assertEquals(sortedBankAccounts.get(0), bankAccountOne);
        Assert.assertEquals(sortedBankAccounts.get(1), bankAccountThree);
        Assert.assertEquals(sortedBankAccounts.get(2), bankAccountTwo);
        Assert.assertEquals(sortedBankAccounts.get(3), bankAccountFour);
    }

    @Test
    public void should_sort_accounts_by_solde_desc() throws Exception {
        List<BankAccount> sortedBankAccounts = bankManagement.getSortedBankAccounts(Criteria.SOLDE, OrderBy.DESC);
        Assert.assertEquals(sortedBankAccounts.get(0), bankAccountFour);
        Assert.assertEquals(sortedBankAccounts.get(1), bankAccountTwo);
        Assert.assertEquals(sortedBankAccounts.get(2), bankAccountThree);
        Assert.assertEquals(sortedBankAccounts.get(3), bankAccountOne);
    }

    @Test
    public void should_sort_accounts_by_login_inc() throws Exception {
        List<BankAccount> sortedBankAccounts = bankManagement.getSortedBankAccounts(Criteria.LOGIN, OrderBy.INC);
        Assert.assertEquals(sortedBankAccounts.get(0), bankAccountTwo);
        Assert.assertEquals(sortedBankAccounts.get(1), bankAccountThree);
        Assert.assertEquals(sortedBankAccounts.get(2), bankAccountOne);
        Assert.assertEquals(sortedBankAccounts.get(3), bankAccountFour);
    }

    @Test
    public void should_sort_accounts_by_login_desc() throws Exception {
        List<BankAccount> sortedBankAccounts = bankManagement.getSortedBankAccounts(Criteria.LOGIN, OrderBy.DESC);
        Assert.assertEquals(sortedBankAccounts.get(0), bankAccountFour);
        Assert.assertEquals(sortedBankAccounts.get(1), bankAccountOne);
        Assert.assertEquals(sortedBankAccounts.get(2), bankAccountThree);
        Assert.assertEquals(sortedBankAccounts.get(3), bankAccountTwo);
    }

    private void storeAccounts() {
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankManagement = new BankManagement(bankAccounts);
        bankAccounts.add(bankAccountOne);
        bankAccounts.add(bankAccountTwo);
        bankAccounts.add(bankAccountThree);
        bankAccounts.add(bankAccountFour);
    }

    private void createAccounts() {
        bankAccountOne = new BankAccount(12.3, "med@gmail.com", 2013);
        bankAccountTwo = new BankAccount(190.0, "alain@gmail.com", 2015);
        bankAccountThree = new BankAccount(120.0, "jean@gmail.com", 2018);
        bankAccountFour = new BankAccount(1020.35, "ubarld@gmail.com", 2000);
    }
}