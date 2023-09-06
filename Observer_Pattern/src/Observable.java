import java.util.ArrayList;

public abstract class Observable<T> {
    protected ArrayList<Observer<T>> subscribtions = new ArrayList<>();

    void notifys(T article) {
        for (Observer<T> observer : subscribtions) {
            observer.update(article);
        }
    };

    void subscribe(Observer<T> ob) {
        subscribtions.add(ob);
    };

    void unSubscribe(Observer<T> ob) {
        int idx = subscribtions.indexOf(ob);
        if (idx >= 0) {
            subscribtions.remove(idx);
        }
    };
}
