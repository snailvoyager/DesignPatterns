package chap03DecoratorPattern;

public class Soy extends CondimentDecorator {	//구상 데코레이터

	public Soy(Beverage beverage) {
		super(beverage);        //모카가 들어간 음료
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	
	public double cost() {
		return .15 + beverage.cost();	//모카가 들어간 음료 가격 합산
	}
}
