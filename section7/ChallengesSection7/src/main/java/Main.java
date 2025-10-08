public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Tesla");
        car.setModel("X");
        car.setDoors(4);
        car.setColor("Red");
        car.setConvertible(false);

        car.describeCar();
    }
}
