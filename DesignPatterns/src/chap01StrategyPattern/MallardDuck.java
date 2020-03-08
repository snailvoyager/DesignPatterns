package chap01StrategyPattern;

import chap01StrategyPattern.fly.FlyWithWings;
import chap01StrategyPattern.quack.Quack;

public class MallardDuck extends Duck{
	public MallardDuck() {
		quackBehavior = new Quack();		//인스턴스 변수 상속
		flyBehavior = new FlyWithWings();	//행동 클래스에 위임
	}
	
	public void display() {
		System.out.println("I'm Mallard Duck.");
	}
}
