package Decorator;

public class Strawberry extends Decorator{

    IceCream iceCream;

    public Strawberry(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " 딸기";
    }

    @Override
    public int price() {
        return iceCream.price() + 500;
    }
}
