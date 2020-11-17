package Facade.case1;

public class TestPattern {
    public static void main(String[] args) {
        SimpleProductFacade simpleProductFacade = new SimpleProductFacade();
        simpleProductFacade.setName("printer");
        System.out.println("The product name is " + simpleProductFacade.getName());
    }

}
