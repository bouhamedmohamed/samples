import java.util.Optional;

public class EmailRules extends Rules {

    private Rules nextRules;
    private static final String EMAIL_PATTERN ="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

    @Override
    public Optional<String> checkRules(Personne personne) {
        if (personne.checkEmail(EMAIL_PATTERN)) {
            if (nextRules != null)
                return nextRules.checkRules(personne);
            return Optional.empty();
        } else
            throw new RuntimeException("Email invalid");
    }

    @Override
    public void setNextRules(Rules rules) {
        nextRules = rules;
    }

}
