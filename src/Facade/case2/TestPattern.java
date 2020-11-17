package Facade.case2;

public class TestPattern {

    public static void main(String[] args) {

        Computer computer = new Computer();
        Radio radio = new Radio();
        Light light = new Light();

        // Facade 전 동작 방식
        computer.turnOff();
        radio.turnOff();
        light.turnOff();

        // 적용 후
        HomeFacade homeFacade = new HomeFacade(computer, light, radio);
        homeFacade.homeIn();
    }
}
