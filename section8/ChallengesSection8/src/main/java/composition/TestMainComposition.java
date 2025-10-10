package composition;

public class TestMainComposition {

    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker(true);
        DishWasher dishWasher = new DishWasher(false);
        Refrigerator refrigerator = new Refrigerator(true);
        SmartKitchen smartKitchen = new SmartKitchen(coffeeMaker, dishWasher,refrigerator);

        smartKitchen.doKitchenWork();
    }
}
