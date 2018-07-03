package treeSet;

import java.util.Comparator;

public class Personne implements Comparable<Personne> {
    private final String name;
    private final String lastName;
    private final String email;
    private final int age;

    public Personne(String name, String lastName, String email, int age) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Personne{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
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

    @Override
    public int compareTo(Personne o) {
        return this.email.compareTo(o.email);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
