package chap03DecoratorPattern;

public abstract class CondimentDecorator extends Beverage {	//추상 데코레이터

	protected Beverage beverage;

	public CondimentDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	public abstract String getDescription();	//모든 첨가물 데코레이터에서 구현

	public abstract double cost();
}
