package chap04FactoryPattern;

import chap04FactoryPattern.fm.ChicagoPizzaStore;
import chap04FactoryPattern.fm.NYPizzaStore;
import chap04FactoryPattern.fm.Pizza;
import chap04FactoryPattern.fm.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("A ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("B ordered a " + pizza.getName() + "\n");

        chap04FactoryPattern.af.PizzaStore nyPizzaStore = new chap04FactoryPattern.af.NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");
    }
}
