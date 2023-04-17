package chap06CommandPattern;

public class SimpleRemoteControl {  //Invoker
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {   //리모컨 버튼의 기능을 변경
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();     //커맨드 객체의 execute() 실행
    }
}
