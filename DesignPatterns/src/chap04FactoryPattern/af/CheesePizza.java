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
        sauce = ingredientFactory.createSauce();        //어떤 팩토리를 주입하느냐에 따라 달라짐
        cheese = ingredientFactory.createCheese();      //피자 클래스에서는 어떤 팩토리를 사용하든 신경쓰지 않고 재사용 가능
    }
}
