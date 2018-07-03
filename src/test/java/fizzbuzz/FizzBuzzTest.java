package fizzbuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {


    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_deux() throws Exception {
        Assert.assertEquals("2", fizzBuzz.calculate(2));
    }
    @Test
    public void should_return_one() throws Exception {
        Assert.assertEquals("1", fizzBuzz.calculate(1));
    }

    @Test
    public void should_return_fizz() throws Exception {
        Assert.assertEquals("fizz", fizzBuzz.calculate(3));
        Assert.assertEquals("fizz", fizzBuzz.calculate(6));
        Assert.assertEquals("fizz", fizzBuzz.calculate(9));
    }

    @Test
    public void should_return_buzz() throws Exception {
        Assert.assertEquals("buzz", fizzBuzz.calculate(5));
        Assert.assertEquals("buzz", fizzBuzz.calculate(10));
    }
    @Test
    public void should_return_fizzbuzz() throws Exception {
        Assert.assertEquals("fizzbuzz", fizzBuzz.calculate(15));
        Assert.assertEquals("fizzbuzz", fizzBuzz.calculate(30));

    }

    @Test
    public void should_return_1_2_30_3_5_3() throws Exception {
        Assert.assertEquals("1 2 fizzbuzz fizz buzz fizz buzz buzz fizz", fizzBuzz.calculateFromChain("1 2 30 3 5 3 5 5 3"));


    }
}
