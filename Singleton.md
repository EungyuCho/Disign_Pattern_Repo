<h2>1. Singleton</h2><br/> 

객체가 너무 많아질 때 컴퓨터의 자원을 과도하게 소비하게 되고 이는 프로그램 성능의 저하를 유발합니다.<br>
이러한 문제점을 해결하기 위해서 객체의 호출 시 최초에 생성한 객체를 반환해서 객체의 중복생성을 막을 수 있습니다.<br>


<h4>1-1. 객체 </h4><hr>
<blockquote>
    Singleton 인스턴스가 너무 많은 일을 하거나 데이터를 공유시킬 경우 인스턴스간의 결합도가 높아져 '개방-폐쇄 원칙'을 위배하게 됩니다.<br>
    즉 수정 및 테스트가 어려워지는 단점이 있습니다.
</blockquote>

<h4>구현 코드</h4><hr>
<pre><code>public class Database {
   private static Database singleton = new Database("products");       //Thread에 safe하게 static instance
   private String name;<br>
   public Database(String name) {
       try {
           Thread.sleep(100);      // 데이터베이스에 연결이 조금 지연되는점을 쓰레드를 통해서 구현
           this.name = name;
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }<br>
   public static Database getInstance(String name) {
       return singleton;
   }<br>
   public String getName() {
       return name;
   }
}</code></pre>

