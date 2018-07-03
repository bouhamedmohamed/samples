import java.util.Optional;

public class AgeRules extends Rules {
    private Rules nextRules;
    final static int AGE_MIN = 18;

    @Override
    public Optional<String> checkRules(Personne personne) {

        if (personne.verifAge(AGE_MIN)) {
            if (nextRules != null)
                return nextRules.checkRules(personne);
            return Optional.empty();
        } else
            throw new RuntimeException("Age invalid");
    }

    @Override
    public void setNextRules(Rules rules) {
        nextRules = rules;
    }
}
