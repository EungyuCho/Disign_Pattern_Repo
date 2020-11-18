package Bridge;

public class Cook extends IAction{
    public Cook(IRobot robot) {
        super(robot);
    }

    public void doCook() {
        System.out.println("요리를 합니다.");
    }
}
