package chap04FactoryPattern.af;

import chap04FactoryPattern.af.ingredient.*;

public interface PizzaIngredientFactory {       //Abstract Factory
    //공통적으로 사용하는 부분이 있다면 추상 클래스로 만들기
    public Dough createDough();     //모든 공장에서 구현해야하는 메소드
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
