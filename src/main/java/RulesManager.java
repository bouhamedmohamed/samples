import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RulesManager {
    private static final List<Rules> rules;
    public static final int RACINE_RULES = 0;

    static {
        rules = Arrays.asList(
                new LengthRules(),
                new EmailRules(),
                new AgeRules());


        for (int order = 0; order < rules.size() - 1; order++) {
            int nextRuleOrder = order + 1;
            rules.get(order).setNextRules(rules.get(nextRuleOrder));
        }

    }

    public Optional<String> checkRules(Personne personne) {
        return rules.get(RACINE_RULES).checkRules(personne);
    }
}
