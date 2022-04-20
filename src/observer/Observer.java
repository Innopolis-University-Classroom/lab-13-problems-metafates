package observer;

import java.util.ArrayList;

public class Observer<T extends Updateable<O>, O> {
    private final ArrayList<T> subscribers = new ArrayList<>();

    public void subscribe(T t) {
        subscribers.add(t);
    }

    public void notify(O o) {
        subscribers.forEach(subscriber -> subscriber.update(o));
    }
}
