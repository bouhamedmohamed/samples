package Observator;

import org.junit.Before;
import org.junit.Test;

public class FBMessageTest {

    private Subject fb;
    private Observator alain;
    private Observator med;
    private Observator amine;

    @Before
    public void setUp() throws Exception {
        amine = new SubsOne("amine");
        med = new SubsOne("med");
        alain = new SubsOne("alain");
        fb = new FBMessage();

    }

    @Test
    public void should_subscribe_and_notify() throws Exception {
        fb.subscribe(amine);
        System.out.println("*********************************");
        fb.subscribe(med);
        System.out.println("*********************************");
        fb.subscribe(alain);
        System.out.println("*********************************");
    }

    @Test
    public void should_subscribe_dessubscrib_and_notify() throws Exception {
        fb.subscribe(med);
        System.out.println("*********************************");
        fb.subscribe(alain);
        System.out.println("*********************************");
        fb.desSubscribe(med);
        System.out.println("*********************************");
    }
}