<h2>8. Bridge</h2><br/> 

Bridge pattern은 기능클래스와 구현클래스를 분리하는 역할을 하는 패턴이다.<br>

<h4>구현 코드</h4><hr>
<pre><code>// 기능 클래스 계층
public class Display {<br>
    private DisplayImpl impl;<br>
    public Display(DisplayImpl impl) {
       this.impl = impl;
    }<br>
    public void open(){
       impl.rawOpen();
    }<br>
    public void print(){
       impl.rawPrint();
    }<br>
    public void close(){
       impl.rawClose();
    }<br>
    public final void display(){
       open();
       print();
       close();
    }
}
// 기능 클래스 계층
public class CountDisplay extends Display {<br>
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }<br>
    public void multiDisplay(int times){
        open();
        for(int i = 0; i< times; i++){   	// times회 반복해서 표시한다
            print();
        }
        close();
    }<br>
}// 구현 클래스 계층
 public abstract class DisplayImpl {
     public abstract void rawOpen();
     public abstract void rawPrint();
     public abstract void rawClose();
 }<br>
 // 구현 클래스 계층
 public class StringDisplayImpl extends DisplayImpl {<br>
     private String string;			   // 표시해야 할 문자열
     private int width;				   // 바이트 단위로 계산할 문자열의 '길이'<br>
     public StringDisplayImpl(String string) {		// 생성자에서 전달된 문자열 string을
         this.string = string;						// 필드에 기억해둔다.
         this.width = string.getBytes().length; 	    // 그리고 바이트 단위의 길이도 필드에 기억해두고 나중에 사용한다.
     }<br>
     @Override
     public void rawOpen() {
         printLine();
     }<br>
     @Override
     public void rawPrint() {
         System.out.println("|" + string + "|");    // 앞뒤에 "|" 를 붙여서 표시한다.
     }<br>
     @Override
     public void rawClose() {
         printLine();
     }<br>
      private void printLine() {
         System.out.print("+");		           // 테두리의 모서리를 표현하는 "+" 마크를 표시한다.
         for (int i = 0; i < width; i++) {	   // width개의 "-"를 표시해서
             System.out.print("-");			   // 테두리 선으로 이용한다.
         }
         System.out.println("+");	           // 테두리 모서리를 표시하는 "+" 마크를 표시한다.
     }<br>
 }<br>
public class TestDisplay {
    public static void main(String[] args) {<br>
        Display d1 = new Display(new StringDisplayImpl("Hello, Korea!"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World!"));<br>
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe!"));<br>
        d1.display();
        d2.display();
        d3.display();<br>
        d3.multiDisplay(5);
    }
}<br><br>
//출력 결과
+-------------+
|Hello, Korea!|
+-------------+
+-------------+
|Hello, World!|
+-------------+
+----------------+
|Hello, Universe!|
+----------------+
+----------------+
|Hello, Universe!|
|Hello, Universe!|
|Hello, Universe!|
|Hello, Universe!|
|Hello, Universe!|
+----------------+

</code></pre>
<h3><a href="https://github.com/EungyuCho/Disign_Pattern_Repo">목차로 돌아가기 🏃</a></h3> 