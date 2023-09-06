
public class ItalianPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        IngredientFactory f = new ItalianIngredientFactory();
        if (type.equals("Cheese")) {
            return new CheesePizza(f);
        } else if (type.equals("Chicken")) {
            return new ChickenPizza(f);
        }
        return null;
    }

}
