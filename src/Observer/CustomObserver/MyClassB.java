package Observer.CustomObserver;

public class MyClassB implements Observer {
    Publisher observable;
    private boolean bPlay;

    public MyClassB(Publisher o) {
        this.observable = o;
        observable.addObserver(this);
    }

    @Override
    public void update(boolean flag) {
        this.bPlay = flag;
        myActControl();
    }

    private void myActControl() {
        if (bPlay) {
            System.out.println("MyClassB : 동작을 시작합니다.");
        } else {
            System.out.println("MyClassB : 동작을 정지합니다.");
        }
    }

}
