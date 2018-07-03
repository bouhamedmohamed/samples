import java.util.Optional;

public abstract class Rules {

    private Rules rules;


    public Optional<String> checkRules(Personne personne) {
        return rules.checkRules(personne);

    }

    public void setNextRules(Rules rules) {
        this.rules = rules;
    }
}
