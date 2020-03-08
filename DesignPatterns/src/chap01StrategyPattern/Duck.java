package chap01StrategyPattern;

import chap01StrategyPattern.fly.FlyBehavior;
import chap01StrategyPattern.quack.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;		//행동 인터페이스
	QuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();		//행동 클래스에 위임
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks can swim.");
	}
}
