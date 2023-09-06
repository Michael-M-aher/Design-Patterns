
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;

    void bake() {
        System.out.println("Baking Pizza ");
    }

    void cut() {
        System.out.println("Cutting Pizza ");
    }

}
