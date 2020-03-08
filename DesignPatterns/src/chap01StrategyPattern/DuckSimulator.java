package chap01StrategyPattern;

import chap01StrategyPattern.fly.FlyRocketPowered;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();		//위임받은 행동 인터페이스의 구현체가 동작
		mallard.performQuack();
		System.out.println();
		
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());	//동적으로 행동클래스 위임 변경
		model.performFly();
	}

}
