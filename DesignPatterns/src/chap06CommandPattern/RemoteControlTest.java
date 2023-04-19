package chap06CommandPattern;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl(); //invoker
        Light light = new Light();      //receiver
        LightOnCommand lightOn = new LightOnCommand(light); //command

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light();
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
    }
}
