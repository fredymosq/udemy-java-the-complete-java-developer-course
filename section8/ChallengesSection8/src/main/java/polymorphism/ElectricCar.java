package polymorphism;

public class ElectricCar extends Car{

    public ElectricCar(String description) {
        super(description);
    }

    public double avgKmPerLitre(){
        return 4.5;
    }

    public int cylinders(){
        return 600;
    }
}
