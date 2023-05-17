package chap08TemplateMethodPattern;

public abstract class CaffeineBeverage {        //전체적인 처리 과정을 관리
    final void prepareRecipe() {    //템플릿 메소드. 아무렇게나 음료를 만들지 못하도록 final 선언
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();   //서로 다른 방식으로 처리되는 메소드를 추상화

    abstract void addCondiments();      //메소드를 일반화시켜서 베이스 클래스에 등록

    void boilWater() {      //같은 방식으로 처리되는 메소드
        System.out.println("boil water...");
    }

    void pourInCup() {
        System.out.println("pour in cup...");
    }
}
