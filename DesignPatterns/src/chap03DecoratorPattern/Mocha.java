package chap03DecoratorPattern;

public class Mocha extends CondimentDecorator{		//구상 데코레이터
	Beverage beverage;		//감싸고자하는 음료를 저장
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	
	public double cost() {
		return .20 + beverage.cost();	//음료 가격 합산
	}
}
