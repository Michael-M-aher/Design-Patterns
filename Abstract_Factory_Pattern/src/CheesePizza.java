
public class CheesePizza extends Pizza {

    CheesePizza(IngredientFactory f) {
        name = f.createName() + " cheese";
        dough = f.createDough();
        cheese = f.createCheese();
    }

}