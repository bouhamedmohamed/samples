package calc.two;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CalculorTest {

    private static final double DELTA = 0.0001;
    private Calculor calculor;
    private List<Opertaion> opertaions;


    @Before
    public void setUp() throws Exception {
        calculor = new Calculor();

    }

    @Test
    public void should_calcul_full_transaction_sum() throws Exception {
        opertaions = Arrays.asList(new Opertaion(1000.0, "deposit"), new Opertaion(2000.0, "deposit"), new Opertaion(100.0, "withdrawal"), new Opertaion(300.0, "deposit"));
        Assert.assertEquals(calculor.operation(opertaions), 3200, DELTA);

    }

    @Test
    public void should_calcul_null() throws Exception {
        Assert.assertEquals(calculor.operation(null), 0, DELTA);

    }

    @Test
    public void should_calcul_empty() throws Exception {
        opertaions = Collections.EMPTY_LIST;
        Assert.assertEquals(calculor.operation(opertaions), 0, DELTA);

    }

    @Test
    public void should_write_operations_sorted() throws Exception {
        opertaions = Arrays.asList(new Opertaion(1000.0, "deposit"), new Opertaion(2000.0, "deposit"), new Opertaion(100.0, "withdrawal"), new Opertaion(300.0, "deposit"));
        opertaions.forEach(System.out::println);

        opertaions=opertaions.stream().sorted((o1, o2) -> o1.getId()-o2.getId()).collect(Collectors.toList());
        opertaions.stream().forEach(System.out::println);
    }
}