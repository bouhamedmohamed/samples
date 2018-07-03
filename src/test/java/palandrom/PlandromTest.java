package palandrom;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlandromTest {

    private Plandrom plandrom;

    @Before
    public void setUp() throws Exception {
        plandrom = new Plandrom();
    }

    @Test
    public void should_return_true_when_empty_string() throws Exception {
        Assert.assertEquals(true, plandrom.checkPlandromString(""));
    }
    @Test
    public void should_return_true_when_string_size_one() throws Exception {
        Assert.assertEquals(true, plandrom.checkPlandromString("a"));
    }
    @Test
    public void should_return_true_when_string_has_samechar() throws Exception {
        Assert.assertEquals(true, plandrom.checkPlandromString("aa"));
    }
    @Test
    public void should_return_true_when_string_ada() throws Exception {
        Assert.assertEquals(true, plandrom.checkPlandromString("ada"));
    }
    @Test
    public void should_return_true_when_string_elle() throws Exception {
        Assert.assertEquals(true, plandrom.checkPlandromString("elle"));
    }
    @Test
    public void should_return_false_when_string_sde() throws Exception {
        Assert.assertEquals(false, plandrom.checkPlandromString("sde"));
    }
}