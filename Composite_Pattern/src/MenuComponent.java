
public interface MenuComponent {
    String getName();

    String getDescription();

    double getPrice();

    boolean isVegetarian();

    void print();

    void add(MenuComponent m);

    void remove(MenuComponent m);

    MenuComponent getChild(int i);

}
