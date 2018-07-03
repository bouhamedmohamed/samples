package bank;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class bankManagementTest {

    private BankManagement bankManagement;

    @Before
    public void setUp() throws Exception {
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(new BankAccount(12.3, "med@gmail.com", 2013));
        bankAccounts.add(new BankAccount(190.0, "alain@gmail.com", 2015));
        bankAccounts.add(new BankAccount(120.0, "jean@gmail.com", 2018));
        bankAccounts.add(new BankAccount(1020.35, "ubarld@gmail.com", 2000));
        bankManagement = new BankManagement(bankAccounts);
    }

    @Test
    public void should_print_sorted_account() throws Exception {
        System.out.println("******* sorted by yearOf creation INC **************");
        bankManagement.printBankAccount(bankManagement.getSortedBankAccounts(Criteria.DATE,OrderBy.INC));
        System.out.println("******* sorted by solde INC**************");
        bankManagement.printBankAccount(bankManagement.getSortedBankAccounts(Criteria.SOLDE,OrderBy.INC));
        System.out.println("******* sorted by login INC**************");
        bankManagement.printBankAccount(bankManagement.getSortedBankAccounts(Criteria.LOGIN,OrderBy.INC));

        System.out.println("******* sorted by yearOf creation DESC **************");
        bankManagement.printBankAccount(bankManagement.getSortedBankAccounts(Criteria.DATE,OrderBy.DESC));
        System.out.println("******* sorted by solde DESC**************");
        bankManagement.printBankAccount(bankManagement.getSortedBankAccounts(Criteria.SOLDE,OrderBy.DESC));
        System.out.println("******* sorted by login DESC**************");
        bankManagement.printBankAccount(bankManagement.getSortedBankAccounts(Criteria.LOGIN,OrderBy.DESC));
    }
}