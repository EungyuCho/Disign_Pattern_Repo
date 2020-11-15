package SingletonPattern;

public class DatabaseTestPattern {

    static int nNum = 0;

    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                nNum++;
                Database database = Database.getInstance(nNum + "번째 Database");
                System.out.println("This is the " + database.getName() + " !!!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        };

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(task);
            thread.start();
        }
    }
}
