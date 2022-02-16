package chap04FactoryPattern.fm;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {     //객체를 생성하는 factory method
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
