package Observator;

public interface Subject {
    public void subscribe(Observator observator);

    public void desSubscribe(Observator observator);

    public void notifyAllObservators();
}
