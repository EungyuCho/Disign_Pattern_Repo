package Strategy.case1;

public class TestPattern {

    public static void main(String[] args) {
        AObj aObj = new AObj(new BImplement());
        aObj.someFunc();
    }

}
