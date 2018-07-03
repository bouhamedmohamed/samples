package Calculatrice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatriceTest {

    private Calculatrice calculatrice;

    @Before
    public void setUp() throws Exception {
        calculatrice = new Calculatrice();
    }

    @Test
    public void sholud_return_zero() throws Exception {
        Assert.assertEquals(0, calculatrice.calculate("0 + 0"), 0.0001);
    }

    @Test
    public void sholud_return_one() throws Exception {

        Assert.assertEquals(1, calculatrice.calculate("0 + 1"), 0.0001);

    }

    @Test
    public void sholud_return_two() throws Exception {

        Assert.assertEquals(2, calculatrice.calculate("2 * 1"), 0.0001);

    }

    @Test
    public void sholud_return_1() throws Exception {

        Assert.assertEquals(1, calculatrice.calculate("3 - 2"), 0.0001);

    }

    @Test
    public void sholud_return_2() throws Exception {
        Assert.assertEquals(2, calculatrice.calculate("6 / 3"), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sholud_raise_exception() throws Exception
    {
        calculatrice.calculate("6 / 0");
    }
    @Test(expected = IllegalArgumentException.class)
    public void sholud_raise_exception_two() throws Exception
    {
        calculatrice.calculate("6 y 0");
    }
}
