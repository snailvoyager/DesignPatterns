package chap06CommandPattern;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;        //마지막으로 사용한 커맨드 객체 저장

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();    //아무것도 하지 않는 커맨드 객체. null 처리를 하지 않기 위해
        for (int i=0; i<7; i++) {
            onCommands[i] = noCommand;      //기본 값으로 설정
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;        //undo 버튼을 누르더라도 아무 것도 안함
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
