package chap03DecoratorPattern;

public class Soy extends CondimentDecorator{
	Beverage beverage;
	
	public Soy(Beverage beverage) {		//모카가 들어간 음료
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	
	public double cost() {
		return .15 + beverage.cost();	//모카가 들어간 음료 가격 합산
	}
}
