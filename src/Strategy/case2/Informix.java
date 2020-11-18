package Strategy.case2;

public class Informix extends Database{

    public Informix() {
        name = "Informix";
        rows = 40;
    }

    @Override
    public void connectDatabase() {
        System.out.println(name + "에 접속했습니다..");
    }
}
