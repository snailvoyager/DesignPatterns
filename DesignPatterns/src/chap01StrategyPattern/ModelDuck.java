package chap01StrategyPattern;

import chap01StrategyPattern.fly.FlyNoWay;
import chap01StrategyPattern.quack.Quack;

public class ModelDuck extends Duck{
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("I'm Model Duck.");
	}
}
