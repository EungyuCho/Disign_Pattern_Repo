package Observer.CustomObserver;

public class TestPattern {

    public static void main(String[] args) throws InterruptedException {
        PlayController pager = new PlayController();

        Observer ob1 = new MyClassA(pager);
        Observer ob2 = new MyClassB(pager);

        pager.setFlag(false);

        Thread.sleep(500);

        pager.setFlag(true);

        pager.deleteObserver(ob1);

        pager.setFlag(false);

    }

}
