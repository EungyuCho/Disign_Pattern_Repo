<h2>7. Decorator</h2><br/> 

객체의 결합을 통해 기능을 유연하게 확장 할 수 있게 해주는 패턴이다.<br>
<h4>1-1. 단점</h4><hr>
<blockquote>
    데코레이터를 많이 사용하면 코드가 더 복잡해질 수 있습니다.<br>
    구성요소를 초기화하는데 코드가 복잡해진다.
</blockquote>

<h4>구현 코드</h4><hr>
<pre><code>public abstract class IceCream {<br>
   protected String description = "";<br>
   public String getDescription() {
       return this.description;
   }<br>
   public abstract int price();
}<br>
public class IceCreamCake extends IceCream{
 
    public IceCreamCake() {
        this.description = "아이스크림(케이크)";
    }
     @Override
    public int price() {
        return 1500;
    }
}<br>
public class IceCreamCone extends IceCream{
    //생성자, price
}<br>
public class IcePop extends IceCream{
    //생성자, price
}<br><br>
//데코레이터 추상 클래스
public abstract class Decorator extends IceCream{<br>
    public abstract String getDescription();
}<br>
public class Melon extends Decorator{<br>
    IceCream iceCream;<br>
    public Melon(IceCream iceCream) {
        this.iceCream = iceCream;
    }<br>
    @Override
    public String getDescription() {
        return iceCream.getDescription() + " 멜론";
    }<br>
    @Override
    public int price() {
        return iceCream.price() + 300;
    }
}<br>
public class Strawberry extends Decorator{<br>
    IceCream iceCream;<br>
    public Strawberry(IceCream iceCream) {
        this.iceCream = iceCream;
    }<br>
    @Override
    public String getDescription() {
        return iceCream.getDescription() + " 딸기";
    }<br>
    @Override
    public int price() {
        return iceCream.price() + 500;
    }
}
//Main
public class TestPattern {<br>
    public static void main(String[] args) {
        IceCream iceCream1 = new IceCreamCone();
        System.out.println(iceCream1.getDescription() + " cost " + iceCream1.price());<br>
        IceCream iceCream2 = new IceCreamCake();
        iceCream2 = new Strawberry(iceCream2);
        System.out.println(iceCream2.getDescription() + " cost " + iceCream2.price());<br>
        IceCream iceCream3 = new Melon(new Strawberry(new IcePop()));
        System.out.println(iceCream3.getDescription() + " cost " + iceCream3.price());
    }
}
</code></pre>
<h3><a href="https://github.com/EungyuCho/Disign_Pattern_Repo">목차로 돌아가기 🏃</a></h3> 