package chap01StrategyPattern;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();		//위임받은 행동 인터페이스의 구현체가 동작
		mallard.performQuack();
	}

}
