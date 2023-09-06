public class App {
    public static void main(String[] args) throws Exception {
        NewsPaper<String> n = new NewsPaper<>();
        Subscriber<String> s1 = new Subscriber<>();
        Subscriber<String> s2 = new Subscriber<>();
        n.subscribe(s1);
        n.subscribe(s2);
        n.publishArticle("Test article");
        NewsPaper<Integer> n2 = new NewsPaper<>();
        Subscriber<Integer> s3 = new Subscriber<>();
        Subscriber<Integer> s4 = new Subscriber<>();
        n2.subscribe(s3);
        n2.subscribe(s4);
        n2.publishArticle(123);
    }
}
