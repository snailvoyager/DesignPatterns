package chap01StrategyPattern.quack;

public class Squeak implements QuackBehavior{
	public void quack() {
		System.out.println("queak~");
	}
}
