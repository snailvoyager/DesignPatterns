package chap04FactoryPattern.af;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{        //각 지역에 맞는 원재료 생성

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { /*new Garlic(), new Onion(), new Mushroom(), new RedPepper()*/ };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
