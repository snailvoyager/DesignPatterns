package chap06CommandPattern;

public class Light {    //Receiver
    String location = "";

    public Light() {}

    public void on() {
        System.out.println(location + " light is on");
    }

    public void off() {
        System.out.println(location + " light is off");
    }
}
