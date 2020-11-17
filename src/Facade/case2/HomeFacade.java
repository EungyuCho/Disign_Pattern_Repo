package Facade.case2;

public class HomeFacade {
    private Computer computer;
    private Light light;
    private Radio radio;

    public HomeFacade(Computer computer, Light light, Radio radio) {
        this.computer = computer;
        this.light = light;
        this.radio = radio;
    }

    public void homeIn() {
        System.out.println("집에 오면 Computer를 키고, Radio를 키고, Light를 킨다.");
        if (!computer.isTurnedOn())
            computer.turnOn();

        if(!radio.isTurnedOn())
            radio.turnOn();

        if (!light.isTurnedOn()) {
            light.turnOn();
        }
    }

    public void homeOut() {
        System.out.println("나갈땐 Computer를 끄고, Radio를 끄고, Light를 끈다.");
        if (computer.isTurnedOn())
            computer.turnOff();

        if(radio.isTurnedOn())
            radio.turnOff();

        if (light.isTurnedOn())
            light.turnOff();
    }
}
