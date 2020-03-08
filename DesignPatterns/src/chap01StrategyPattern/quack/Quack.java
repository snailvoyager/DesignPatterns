package chap01StrategyPattern.quack;

public class Quack implements QuackBehavior{
	public void quack() {
		System.out.println("Quack~!!!!");
	}
}
