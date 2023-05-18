package chap08TemplateMethodPattern;

public class CoffeeWithHook extends CaffeinBeverageWithHook{
    @Override
    void brew() {
        System.out.println("brew coffee...");
    }

    @Override
    void addCondiments() {
        System.out.println("add sugar and milk...");
    }

    @Override
    public boolean customerWantsCondiments() {      //hook를 override해서 원하는 기능 구현
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        return "Y";
    }
}
