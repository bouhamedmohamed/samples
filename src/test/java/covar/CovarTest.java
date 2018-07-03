package covar;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CovarTest {
    @Test
    public void should_add_many_type_on_list() throws Exception {

        CovarSubOne covarOne = new CovarSubOne(1);
        CovarSubTwo covarTwo = new CovarSubTwo(2);
        CovarSubOne covarThree = new CovarSubOne(3);
        CovarSubTwo covarfour = new CovarSubTwo(4);
        List< ? extends Covar> covars = Arrays.asList(covarOne, covarTwo, covarThree, covarfour);
        covars.stream().forEach(System.out::println);
    }
}