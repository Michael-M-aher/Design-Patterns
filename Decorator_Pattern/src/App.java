public class App {
    public static void main(String[] args) throws Exception {
        Circle c = new Circle();
        ShadowDec sha = new ShadowDec(c);
        ColorDec co = new ColorDec(sha);
        co.drew();
        sha.drew();
    }
}
