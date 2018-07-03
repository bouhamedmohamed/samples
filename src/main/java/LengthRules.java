import java.util.Optional;

public class LengthRules extends Rules {

    private Rules nextRules;
    final static int LENGTH_STRING = 4;

    @Override
    public Optional<String> checkRules(Personne personne) {
        if (personne.verifLength(LENGTH_STRING)) {
            if (nextRules != null)
                return nextRules.checkRules(personne);
            return Optional.empty();
        } else
            throw new RuntimeException("Length invalid");
    }

    @Override
    public void setNextRules(Rules rules) {
        nextRules = rules;
    }
}
