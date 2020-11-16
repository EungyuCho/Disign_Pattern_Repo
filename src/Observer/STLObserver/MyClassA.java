package Observer.STLObserver;

import java.util.Observable;
import java.util.Observer;

public class MyClassA implements Observer {

    Observable observable;      //등록될 Observable
    private boolean bPlay;      //실행여부

    public MyClassA(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof PlayController) {
            PlayController myControl = (PlayController) o;
            this.bPlay = myControl.getFlag();
            myActControl();
        }
    }

    private void myActControl() {
        if (bPlay) {
            System.out.println("MyClassA : 동작을 시작합니다.");
        } else {
            System.out.println("MyClassA : 동작을 정지합니다.");
        }
    }
}
