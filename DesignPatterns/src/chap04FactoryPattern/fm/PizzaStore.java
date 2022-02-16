package chap04FactoryPattern.fm;

import chap04FactoryPattern.fm.Pizza;

public abstract class PizzaStore {
    //SimplePizzaFactory factory;

//    public PizzaStore (SimplePizzaFactory factory) {      //객체 생성을 캡슐화했지만 유연성 X. 생성 제품을 마음대로 변경 불가.
//        this.factory = factory;
//    }

    public Pizza orderPizza(String type) {
        Pizza pizza;            //추상 클래스에만 의존

        //pizza = factory.createPizza(type);      //객체 생성 부분을 캡슐화. 팩토리에서 구상 객체 생성 (Factory Pattern)
        pizza = this.createPizza(type);         //팩토리 객체가 아닌 서브클래스에서 factoryMethod() 구현. 서브클래스에서 피자의 종류 결정 (Factory Method Pattern)

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);      //factoryMethod() 클라이언트와 구상 형식을 분리
}
