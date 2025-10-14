package restaurant;

public class Main {

    public static void main(String[] args) {
//        Item coke = new Item("Drink", "pepsi", 1.5);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();

        Burger burger = new Burger("regular", 4.5);
        burger.addToppings("BACON", "CHEESE", "MAYO");
        burger.printItem();
    }
}
