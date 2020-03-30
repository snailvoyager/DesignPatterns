package chap03DecoratorPattern;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage3 = new HouseBlend();	//음료
		beverage3 = new Mocha(beverage3);		//모카가 들어간 음료
		beverage3 = new Mocha(beverage3);
		beverage3 = new Soy(beverage3);			//모카가 들어간 음료에 두유 첨가
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}

}
