package chap03DecoratorPattern;

public abstract class Beverage {	//추상 구성요소
	String description ="제목없음";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();	//서브클래스에서 구현
}
