
public class EgyptianIngredientFactory implements IngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public String createName() {
        return "eg";
    }

}
