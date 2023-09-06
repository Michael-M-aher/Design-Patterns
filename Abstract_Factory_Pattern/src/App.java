public class App {
    public static void main(String[] args) throws Exception {
        PizzaStore p = new EgyptianPizzaStore();
        Pizza pi = p.orderPizza("Cheese");
        System.out.println(pi.cheese.getCheese());
    }
}
