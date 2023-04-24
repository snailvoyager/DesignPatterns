package chap06CommandPattern;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl(); //invoker
        Light light = new Light("Basic");      //receiver
        LightOnCommand lightOn = new LightOnCommand(light); //command
        LightOffCommand lightOff = new LightOffCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("LivingRoom");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        Command[] partyOn = {lightOn, livingRoomLightOn};
        Command[] partyOff = {lightOff, livingRoomLightOff};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(1, partyOnMacro, partyOffMacro);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
    }
}
