package transaction;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class transactionTest {

    private TransactionManagement transactionManagement;
    private Transaction transactionNow;
    private Transaction transactionPreviousYear;
    private Transaction transactionNextYear;

    @Before
    public void setUp() throws Exception {
        transactionManagement = new TransactionManagement();
        LocalDate now = LocalDate.now();
        transactionNow = new Transaction("Med", 120.36, LocalDate.now());
        transactionPreviousYear = new Transaction("Med", 15.36, LocalDate.of(now.getYear() - 1, now.getMonth(), now.getDayOfMonth()));
        transactionNextYear = new Transaction("Ali", 100.750, LocalDate.of(now.getYear() + 1, now.getMonth(), now.getDayOfMonth()));
        transactionManagement.add(transactionNow);
        transactionManagement.add(transactionPreviousYear);
        transactionManagement.add(transactionNextYear);
    }

    @Test
    public void should_get_all_transaction_size() throws Exception {
        Assert.assertEquals(3, transactionManagement.getAll().size());
    }

    @Test
    public void should_get_all_transaction__sorted_by_montant() throws Exception {
        List<Transaction> all = transactionManagement.sort(TransactionManagement.sortByMontant());
        Assert.assertTrue(all.get(0).equals(transactionPreviousYear));
        Assert.assertTrue(all.get(1).equals(transactionNextYear));
        Assert.assertTrue(all.get(2).equals(transactionNow));

    }
    @Test
    public void should_get_all_transaction__sorted_by_name() throws Exception {
        List<Transaction> all = transactionManagement.sort(TransactionManagement.sortByName());
        Assert.assertTrue(all.get(0).equals(transactionNextYear));
    }
    @Test
    public void should_get_all_transaction__sorted_by_date() throws Exception {
        List<Transaction> all = transactionManagement.sort(TransactionManagement.sortDate());
        Assert.assertTrue(all.get(0).equals(transactionPreviousYear));
        Assert.assertTrue(all.get(1).equals(transactionNow));
        Assert.assertTrue(all.get(2).equals(transactionNextYear));

    }
}
