package chap04FactoryPattern.af;

import chap04FactoryPattern.af.ingredient.Veggies;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;     //Abstract Product
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();  //뉴욕가게에는 뉴욕공장을 연결 (구상클래스에 의존적?)

        switch(item) {
            case "cheese" :
                pizza = new CheesePizza(ingredientFactory);     //피자를 만들 때 필요한 공장을 전달
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "veggie" :
                //pizza = new Veggies(ingredientFactory);
                break;
            case "clam" :
                //pizza = new Clams(ingredientFactory);
                break;
            case "pepperoni" :
                //pizza = new Pepperoni(ingredientFactory);
                break;
        }

        return pizza;
    }
}
