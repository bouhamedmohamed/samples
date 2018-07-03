import org.junit.Test;

import static org.junit.Assert.*;

public class RulesManagerTest {
    @Test
    public void should_pass() throws Exception {
        Personne personne=new Personne("mohamed","bouhamed",28,"bouh@gma.com");
        RulesManager rulesManager=new RulesManager();
        rulesManager.checkRules(personne);

    }
    @Test(expected = RuntimeException.class)
    public void should_raise_exception_of_length_one() throws Exception {
        Personne personne=new Personne("moh","bouhamed",28,"bouh@gma.com");
        RulesManager rulesManager=new RulesManager();
        rulesManager.checkRules(personne);

    }
    @Test(expected = RuntimeException.class)
    public void should_raise_exception_of_length_two() throws Exception {
        Personne personne=new Personne("mohamed","bou",28,"bouh@gma.com");
        RulesManager rulesManager=new RulesManager();
        rulesManager.checkRules(personne);

    }

    @Test(expected = RuntimeException.class)
    public void should_raise_exception_of_age() throws Exception {
        Personne personne=new Personne("mohamed","bouhamed",2,"bouh@gma.com");
        RulesManager rulesManager=new RulesManager();
        rulesManager.checkRules(personne);

    }

    @Test(expected = RuntimeException.class)
    public void should_raise_exception_of_email() throws Exception {
        Personne personne=new Personne("mohamed","bouhamed",28,"bouhgma.com");
        RulesManager rulesManager=new RulesManager();
        rulesManager.checkRules(personne);

    }


}