package Strategy.case2;

public abstract class Database {
    public String name;
    public double rows;

    // 데이터베이스마다 접속 라이브러리가 다르다.
    public abstract void connectDatabase();

    public void insertData() {
        System.out.println(name + "에 데이터를 추가했습니다.");
    }

    public void selectData() {
        System.out.println(name + "에서 데이터를 " + rows + "개 조회했습니다,");
    }
}
