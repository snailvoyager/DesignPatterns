package chap01StrategyPattern.fly;

public class FlyRocketPowered implements FlyBehavior{
	public void fly() {
		System.out.println("Rocket fly~!!!!");
	}
}
