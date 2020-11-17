<h2>5. Adapter</h2><br/> 

Adapter Pattern은 한 클래스의 인터페이스를 클라이언트에서 사용하고자하는 다른 인터페이스로 변환해준다.<br>


<h4>구현 코드</h4><hr>
<pre><code>public interface Aplayer {
   void play(String fileName);
   void stop();
}<br>
public interface Bplayer {
    void playFile(String fileName);
    void stopFile();
}<br>
// 두 APlayer 인터페이스를 implements 하여 BPlayer의 메소드로 변환해주는 Adapter 클래스를 만들어준다.
public class BToAAdapter implements Aplayer{<br>
    private Bplayer media;<br>
    public BToAAdapter(Bplayer media) {
        this.media = media;
    }<br>
    @Override
    public void play(String fileName) {
        System.out.print("Using Adapter : ");
        media.playFile(fileName);
    }<br>
    @Override
    public void stop() {
    }
}</code></pre>
<h3><a href="https://github.com/EungyuCho/Disign_Pattern_Repo">목차로 돌아가기 🏃</a></h3> 