
public class NewsPaper<T> extends Observable<T> {
    void publishArticle(T article) {
        notifys(article);
    }
}
