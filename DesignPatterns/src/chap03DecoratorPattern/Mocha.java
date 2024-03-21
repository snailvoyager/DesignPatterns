package chap03DecoratorPattern;

public class Mocha extends CondimentDecorator{		//구상 데코레이터

	public Mocha(Beverage beverage) {
		super(beverage);
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	
	public double cost() {
		return .20 + beverage.cost();	//음료 가격 합산
	}
}
