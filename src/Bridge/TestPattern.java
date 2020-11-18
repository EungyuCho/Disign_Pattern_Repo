package Bridge;

public class TestPattern {

    public static void main(String[] args) {

        IRobot robot1 = new RobotModel1();
        Cook work1 = new Cook(robot1);
        work1.powerOn();
        work1.doCook();
        work1.powerOff();

        System.out.println("---------------");

        IRobot robot2 = new RobotModel1();
        Clean work2 = new Clean(robot2);
        work2.powerOn();
        work2.doClean();
        work2.powerOff();

    }
}
