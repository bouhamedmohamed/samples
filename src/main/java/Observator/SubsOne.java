package Observator;

public class SubsOne implements Observator {
    private final String name;

    public SubsOne(String name) {
        this.name = name;
    }

    @Override
    public void displayInfo(String subject, int observatorNumber) {
        System.out.println("Subscriber " + this.name + " follow the subject " + subject + " fllowinf by (" + observatorNumber + ") subscriber(s)");
    }
}
