package Observer.STLObserver;

public class TestPattern {

    public static void main(String[] args) throws InterruptedException {
        PlayController controller = new PlayController();

        MyClassA classA = new MyClassA(controller);
        MyClassB classB = new MyClassB(controller);

        controller.setFlag(false);

        Thread.sleep(500);

        controller.setFlag(true);
    }

}
