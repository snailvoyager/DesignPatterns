package chap03DecoratorPattern;

public class Espresso extends Beverage{		//구상 구성요소
	public Espresso() {
		description = "Espresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}
}
