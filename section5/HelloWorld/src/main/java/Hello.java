public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello from Hello class");

        boolean isAlien = true;

//        if (!isAlien){
//            System.out.println("Is not an alien!");
//        }
        if (isAlien) {
            System.out.println("It is not an Alien");
            System.out.println("And I am scared Alien");
        }

        boolean isCar = false;
        if (isCar = true){
            System.out.println("This is a car");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar != "Volkswagen";

        System.out.println("Is Domestic: "+isDomestic);
    }
}
