package chap01StrategyPattern;

import chap01StrategyPattern.fly.FlyBehavior;
import chap01StrategyPattern.quack.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;		//행동 인터페이스
	QuackBehavior quackBehavior;	//변경되는 부분을 분리하여 캡슐화
	
	public abstract void display();		//자손 클래스에서 구현해야하는 추상메소드
	
	public void performFly() {
		flyBehavior.fly();		//행동 클래스에 위임
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks can swim.");
	}
	
	public void setFlyBehavior(FlyBehavior fb) {		//동적으로 행동 위임
		this.flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
}
