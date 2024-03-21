package chap03DecoratorPattern;

public class HouseBlend extends Beverage {	//래핑되는 구상 컴포넌트
	public HouseBlend() {
		description = "HouseBlend";
	}
	
	public double cost() {
		return .89;
	}
}
