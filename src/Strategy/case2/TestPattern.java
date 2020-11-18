package Strategy.case2;

public class TestPattern {

    public static void main(String[] args) {
        DatabaseUse myDB = new DatabaseUse();

        myDB.connect(DBTYPE.MySQL);
        myDB.select();


        myDB.connect(DBTYPE.Informix);
        myDB.select();
    }
}
