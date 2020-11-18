package Strategy.case1;

public class AObj {

    BInterface bInterface;

    public AObj(BInterface bInterface) {
        this.bInterface = bInterface;
    }

    public void someFunc() {
//        System.out.println("AAA");
//        System.out.println("AAA");

        bInterface.funA();
        bInterface.funA();
    }
}
