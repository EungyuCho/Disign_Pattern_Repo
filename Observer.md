<h2>4. Observer</h2><br/> 

Observer pattern은 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들에게 연락이가고 자동으로 내용이 갱신되는 일대다(one to many) 의존성을 정의한다.<br>
<h4>1-1. 단점</h4><hr>
<blockquote>
    Thread safe 하지 않습니다.<br>
    observer를 delete해주지 않으면 메모리 누수가 발생할 수 있습니다.<br>
    비동기 방식이므로 원하는 순서대로 이벤트 구독이 되지 않을 수 있습니다.
</blockquote>

<h4>구현 코드</h4><hr>
<pre><code>//Observer가 구독할 인터페이스
public interface Publisher {
    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObservers();
}<br>
public interface Observer {
    public void update(boolean flag);
}<br>
//구독 대상 Controller
public class PlayController implements Publisher {
    private List<Observer> observers = new ArrayList<>();       //옵저버들을 컬렉션으로 관리
    private boolean play;<br>
    public PlayController() {  }<br>
    public void setFlag(boolean play) {
        this.play = play;
        notifyObservers();
    }<br>
    public boolean getFlag() {
        return play;
    }<br>
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }<br>
    @Override
    public void deleteObserver(Observer observer) {
        int idx = observers.indexOf(observer);
        observers.remove(idx);
    }<br>
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(play);
        }
    }
}<br>
//Observer
public class MyClassB implements Observer {
    Publisher observable;
    private boolean bPlay;<br>
    public MyClassB(Publisher o) {
        this.observable = o;
        observable.addObserver(this);
    }<br>
    @Override
    public void update(boolean flag) {
        this.bPlay = flag;
        myActControl();
    }<br>
    private void myActControl() {
        if (bPlay) {
            System.out.println("MyClassB : 동작을 시작합니다.");
        } else {
            System.out.println("MyClassB : 동작을 정지합니다.");
        }
    }
}</code></pre>
<h3><a href=" https://github.com/EungyuCho/Disign_Pattern_Repo">목차로 돌아가기 🏃</a></h3> 