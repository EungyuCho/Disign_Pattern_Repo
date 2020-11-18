package Decorator;

public class TestPattern {
    public static void main(String[] args) {

        IceCream iceCream1 = new IceCreamCone();
        System.out.println(iceCream1.getDescription() + " cost " + iceCream1.price());

        IceCream iceCream2 = new IceCreamCake();
        iceCream2 = new Strawberry(iceCream2);
        System.out.println(iceCream2.getDescription() + " cost " + iceCream2.price());

        IceCream iceCream3 = new Melon(new Strawberry(new IcePop()));
        System.out.println(iceCream3.getDescription() + " cost " + iceCream3.price());
    }
}
