<h2>6. Facade</h2><br/> 

Facade Pattern은 하위 시스템을 쉽게 사용할 수 있게 해주는 고급 인터페이스이다.<br>
Adapter 패턴과 비슷하지만 Adapter는 원래 코드를 다른코드와 작동할 수 있는 래퍼를 제공하고, Facade는 원래 코드를 더 쉽게 처리 할 수 있는 래퍼를 제공한다. 
<h4>1-1. 단점</h4><hr>
<blockquote>
    Facade를 사용하면 기본코드를 변경하면 Facade 패턴도 같이 변경해줘야하는 번거로움이 있다.
</blockquote>
<h4>구현 코드</h4><hr>
<pre><code>public class Computer {
   private boolean turnedOn = false;<br>
   public void turnOn() {
       turnedOn = true;
       System.out.println("컴퓨터의 전원을 킵니다.");
   }<br>
   public void turnOff() {
       turnedOn = false;
       System.out.println("컴퓨터의 전원을 끕니다");
   }<br>
   public boolean isTurnedOn() {
       return turnedOn;
   }
}<br>
//위와 동일한 메소드를 가진 Light와 Radio 객체가 있음
public class HomeFacade {
    private Computer computer;
    private Light light;
    private Radio radio;<br>
    public HomeFacade(Computer computer, Light light, Radio radio) {
        this.computer = computer;
        this.light = light;
        this.radio = radio;
    }<br>
    public void homeIn() {
        System.out.println("집에 오면 Computer를 키고, Radio를 키고, Light를 킨다.");
        if (!computer.isTurnedOn())
            computer.turnOn();<br>
        if(!radio.isTurnedOn())
            radio.turnOn();<br>
        if (!light.isTurnedOn()) {
            light.turnOn();
        }
    }<br>
    public void homeOut() {
        System.out.println("나갈땐 Computer를 끄고, Radio를 끄고, Light를 끈다.");
        if (computer.isTurnedOn())
            computer.turnOff();<br>
        if(radio.isTurnedOn())
            radio.turnOff();<br>
        if (light.isTurnedOn()) 
            light.turnOff();
    }
}<br>
public static void main(String[] args) {<br>
    Computer computer = new Computer();
    Radio radio = new Radio();
    Light light = new Light();<br>
    // Facade 전 동작 방식
    computer.turnOff();
    radio.turnOff();
    light.turnOff();<br>
    // 적용 후
    HomeFacade homeFacade = new HomeFacade(computer, light, radio);
    homeFacade.homeIn();
}
</code></pre>
<h3><a href="https://github.com/EungyuCho/Disign_Pattern_Repo">목차로 돌아가기 🏃</a></h3> 