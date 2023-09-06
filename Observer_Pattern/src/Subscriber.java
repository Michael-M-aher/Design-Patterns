
public class Subscriber<T> implements Observer<T> {
    T article;

    @Override
    public void update(T article) {
        this.article = article;
        System.out.println("recieved article " + article);
    }

}
