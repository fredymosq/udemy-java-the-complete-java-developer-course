package polymorphism;

public class TestMainCar {

    public static void main(String[] args) {
        Car car = new Car("2025 Red Ferrari 2000 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2025 Red Ferrari 2000 GTS", 15.4, 6);
        runRace(ferrari);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
