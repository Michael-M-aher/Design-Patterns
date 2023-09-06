
public class ItalianIngredientFactory implements IngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Cheese createCheese() {
        return new ChedarCheese();
    }

    @Override
    public String createName() {
        return "it";
    }

}
