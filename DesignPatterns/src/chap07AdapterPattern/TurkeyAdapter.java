package chap07AdapterPattern;

public class TurkeyAdapter implements Duck{     //Target 인터페이스를 구현
    Turkey turkey;  //Adaptee, 객체 구성 사용

    public TurkeyAdapter (Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
