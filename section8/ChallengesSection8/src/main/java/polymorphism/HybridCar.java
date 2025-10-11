package polymorphism;

public class HybridCar extends Car{

    public HybridCar(String description) {
        super(description);
    }

    public double avgKmPerLitre(){
        return 4.5;
    }

    public int cylinders(){
        return 600;
    }

    public int batterySize(){
        return 400;
    }
}
