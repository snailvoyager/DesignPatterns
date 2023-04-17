package chap06CommandPattern;

public class LightOnCommand implements Command {    //커맨드 객체
    Light light;    //Receiver

    LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {     //리시버의 특정 작업을 처리
        light.on();
    }
}
