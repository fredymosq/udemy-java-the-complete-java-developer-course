package restaurant;

public class Burger extends Item{

    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String type, double price) {
        super("Burger", type, price);
    }

    @Override
    public String getName() {
        return super.getName() + "BURGER";
    }

    @Override
    public double getAdjustPrice() {
        return getBasePrice() +
                ((null == extra1) ? 0 : extra1.getAdjustPrice()) +
                ((null == extra2) ? 0 : extra2.getAdjustPrice()) +
                ((null == extra3) ? 0 : extra3.getAdjustPrice());
    }

    public double getExtraPrice(String toppingName){
        return switch (toppingName.toUpperCase()){
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "SALAMI" -> 1.5;
            default -> 0.0;
        };
    }

    public void addToppings(String extra1, String extra2, String extra3){
        this.extra1 = new Item("TOPPING", extra1, getExtraPrice(extra1));
        this.extra2 = new Item("TOPPING", extra1, getExtraPrice(extra2));
        this.extra3 = new Item("TOPPING", extra1, getExtraPrice(extra3));
    }
}
