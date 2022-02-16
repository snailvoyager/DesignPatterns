package chap04FactoryPattern.af;


public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;       //원재료를 제공하는 공장

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();        //공장에서 만들어 오는 원재료
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
