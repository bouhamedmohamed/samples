package InversString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InversStringTest {

    private InversString inversString;

    @Before
    public void setUp() throws Exception {
        inversString = new InversString();
    }

    @Test
    public void should_return_empty_when_empty_string() {
        String inversedString = inversString.inverse("");
        Assert.assertTrue(inversedString.equals(""));
    }

    @Test
    public void should_return_same_string_when_string_contains_only_one_char() {
        String inversedString = inversString.inverse("s");
        Assert.assertTrue(inversedString.equals("s"));
    }

    @Test
    public void should_return_lo_when_ol() {
        String inversedString = inversString.inverse("lo");
        Assert.assertTrue(inversedString.equals("ol"));
    }
    @Test
    public void should_return_ollo_when_ollo() {
        String inversedString = inversString.inverse("ollo");
        Assert.assertTrue(inversedString.equals("ollo"));
    }
}