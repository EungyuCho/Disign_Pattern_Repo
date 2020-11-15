package SingletonPattern;

public class Database {
    private String name;

    public Database(String name) {
        try {
            Thread.sleep(100);      // 데이터베이스에 연결이 조금 지연되는점을 쓰레드를 통해서 구현
            this.name = name;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class LazyHolder {
        public static final Database INSTANCE = new Database("products");       //Thread에 safe하게 static instance
    }

    public static Database getInstance(String name) {
        return LazyHolder.INSTANCE;
    }

    public String getName() {
        return name;
    }
}
