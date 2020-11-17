package Facade.case2;

public class Computer {
    private boolean turnedOn = false;

    public void turnOn() {
        turnedOn = true;
        System.out.println("컴퓨터의 전원을 킵니다.");
    }

    public void turnOff() {
        turnedOn = false;
        System.out.println("컴퓨터의 전원을 끕니다");
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }
}
