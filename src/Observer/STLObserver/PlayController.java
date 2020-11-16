package Observer.STLObserver;

import java.util.Observable;

public class PlayController extends Observable {

    private boolean bPlay;  //실행 여부

    public PlayController() {

    }

    // 데이터를 전달받아 플래그 값을 변경하고,
    // 새로운 데이터가 들어왔음ㅇ르 알린다.
    public void setFlag(boolean bPlay) {
        this.bPlay = bPlay;
        setChanged();
        notifyObservers();
    }

    public boolean getFlag() {
        return bPlay;
    }
}
