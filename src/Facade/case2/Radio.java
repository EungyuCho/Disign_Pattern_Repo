package Facade.case2;

public class Radio {
    private boolean turnedOn = false;

    public void turnOn() {
        turnedOn = true;
        System.out.println("라디오를 킵니다.");
    }

    public void turnOff() {
        turnedOn = false;
        System.out.println("라디오를 끕니다");
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }
}
