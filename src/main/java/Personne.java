import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Personne {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String email;

    public Personne(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personne personne = (Personne) o;

        return email.equals(personne.email);

    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }

    public boolean verifLength(int lengthString) {
        return firstName.length() >= lengthString && lastName.length() >= lengthString;
    }

    public boolean checkEmail(String emailPattern) {
      return email.indexOf("@")>-1;

    }

    public boolean verifAge(int ageMin) {
        return ageMin <= age;
    }
}
