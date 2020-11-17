package Facade.case2;

public class Light {
    private boolean turnedOn = false;

    public void turnOn() {
        turnedOn = true;
        System.out.println("전등을 킵니다.");
    }

    public void turnOff() {
        turnedOn = false;
        System.out.println("전등을 끕니다");
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }
}
