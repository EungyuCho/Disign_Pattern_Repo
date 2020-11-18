package Decorator;

public class Melon extends Decorator{

    IceCream iceCream;

    public Melon(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " 멜론";
    }

    @Override
    public int price() {
        return iceCream.price() + 300;
    }
}
