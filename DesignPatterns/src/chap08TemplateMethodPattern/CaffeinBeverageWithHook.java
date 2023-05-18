package chap08TemplateMethodPattern;

public abstract class CaffeinBeverageWithHook {
    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {    //hook 메소드 활용
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("boil water...");
    }

    void pourInCup() {
        System.out.println("pour in cup...");
    }

    boolean customerWantsCondiments() {     //별 내용 없는 기본 메소드로 구현. 서브클래스에서 필요에 따라 오버라이드
        return true;
    }
}
