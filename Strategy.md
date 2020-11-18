<h2>9. Strategy</h2><br/> 

Strategy Pattern은 여러 알고리즘을 하나의 추상적인 접근점(인터페이스)을 만들어 알고리즘의 교환을 가능하게 하는 패턴이다.<br>

<h4>구현 코드</h4>
<code><pre>public abstract class Database {
public String name;
public double rows;<br>
// 데이터베이스마다 접속 라이브러리가 다르다.
    public abstract void connectDatabase();
    public void insertData() {
       System.out.println(name + "에 데이터를 추가했습니다.");
    }<br>
    public void selectData() {
       System.out.println(name + "에서 데이터를 " + rows + "개 조회했습니다,");
    }
}<br>
public class Informix extends Database{<br>
    public Informix() {
        name = "Informix";
        rows = 40;
    }<br>
    @Override
    public void connectDatabase() {
        System.out.println(name + "에 접속했습니다..");
    }
}<br>
public class MySQL extends Database{<br>
    public MySQL() {
        name = "MySQL";
        rows = 20;
    }<br>
    @Override
    public void connectDatabase() {
        System.out.println(name + "에 접속했습니다.");
    }
}<br>
enum DBTYPE { MySQL, Informix }<br>
public class DatabaseUse {<br>
    private Database db;<br>
    public void connect(DBTYPE dbtype) {
        switch (dbtype) {
            case MySQL:
                db = new MySQL();
                break;
            case Informix:
                db = new Informix();
                break;
        }<br>
        if (db == null) {
            System.out.println("데이터베이스를 먼저 선택하세요.");
        } else {
            db.connectDatabase();
        }
    }<br>
    public void select() {
        db.selectData();
    }
}<br>
public class TestPattern {<br>
    public static void main(String[] args) {
        DatabaseUse myDB = new DatabaseUse();<br>
        myDB.connect(DBTYPE.MySQL);
        myDB.select();<br>
        myDB.connect(DBTYPE.Informix);
        myDB.select();
    }
}<br>
// 출력 결과
MySQL에 접속했습니다.
MySQL에서 데이터를 20.0개 조회했습니다,
Informix에 접속했습니다..
Informix에서 데이터를 40.0개 조회했습니다,
</code></pre>
<h3><a href="https://github.com/EungyuCho/Disign_Pattern_Repo">목차로 돌아가기 🏃</a></h3> 