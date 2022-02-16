package chap04FactoryPattern.af;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();  //뉴욕가게에는 뉴욕공장을 연결

        if(item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);     //피자를 만들 때 필요한 공장을 전달
            pizza.setName("New York Style Cheese Pizza");
        }

        return pizza;
    }
}
