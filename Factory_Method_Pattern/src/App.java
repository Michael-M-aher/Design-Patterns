public class App {
    public static void main(String[] args) throws Exception {
        IFactory f = new FactoryRunner();
        System.out.println(f.calculateFees());
    }
}
