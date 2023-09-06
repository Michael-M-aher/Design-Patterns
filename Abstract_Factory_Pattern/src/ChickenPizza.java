
public class ChickenPizza extends Pizza {
    ChickenPizza(IngredientFactory f) {
        name = f.createName() + " Chicken";
        dough = f.createDough();
    }

}
