package Observator;

import java.util.ArrayList;
import java.util.List;

public class FBMessage implements Subject {
    List<Observator> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observator observator) {
        subscribers.add(observator);
        notifyAllObservators();
    }

    @Override
    public void desSubscribe(Observator observator) {
        subscribers.remove(observator);
        notifyAllObservators();
    }

    @Override
    public void notifyAllObservators() {
        subscribers.stream()
                .forEach(observator -> observator.displayInfo("FB", subscribers.size()));
    }
}
