package chap08TemplateMethodPattern;

public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("brew tea...");
    }

    @Override
    void addCondiments() {
        System.out.println("add lemon...");
    }
}
