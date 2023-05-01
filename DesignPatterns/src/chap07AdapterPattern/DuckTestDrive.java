package chap07AdapterPattern;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey); //Adapter

        turkey.gobble();
        turkey.fly();

        testDuck(duck);
        testDuck(turkeyAdapter);    //Duck 대신 Turkey로 처리 가능
    }

    static void testDuck(Duck duck) {   //Duck 객체를 받아서 처리하는 메소드
        duck.quack();
        duck.fly();
    }
}
