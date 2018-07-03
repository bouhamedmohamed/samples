package treeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExemple {

    public static void main(String[] args) {
        TreeSet<Personne> treeSet=new TreeSet<>();
        ArrayList<Personne> arrayList=new ArrayList<>();
        Personne personne = new Personne("med", "bouh", "bou@mail", 23);
        Personne personne2 = new Personne("med", "bouh", "bou@mail", 23);
        treeSet.add(personne);
        treeSet.add(personne2);
        System.out.println("******************");
        treeSet.stream().forEach(System.out::println);
        treeSet.removeIf(personne1 -> personne.getAge()>20);
        System.out.println("******************");
        treeSet.stream().forEach(System.out::println);
        arrayList.add(personne);
        arrayList.add(personne2);
        System.out.println("******************");
        arrayList.stream().forEach(System.out::println);
        Collections.sort(arrayList);
        System.out.println("******************");
        arrayList.stream().forEach(System.out::println);
    }
}
