import java.util.ArrayList;

public class Menu implements MenuComponent {
    String name;
    String description;
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {

        return description;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public boolean isVegetarian() {
        return false;
    }

    @Override
    public void print() {
        System.out.println("" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");
        for (MenuComponent m : menuComponents) {
            m.print();

        }
    }

    @Override
    public void add(MenuComponent m) {
        menuComponents.add(m);
    }

    @Override
    public void remove(MenuComponent m) {
        menuComponents.remove(m);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

}
