package Polymorphism;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car engine is starting!");
    }

    public void drive(){
        System.out.println("Car's Driving "+getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Car engine is running!");
    }
}

class GasPoweredCar extends Car{
    private int cylinder=6;
    public double avgKmPerLitre;

    public GasPoweredCar(String description, int cylinder, double avgKmPerLitre) {
        super(description);
        this.cylinder = cylinder;
        this.avgKmPerLitre = avgKmPerLitre;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up,Ready!%n",cylinder);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f ",avgKmPerLitre);
    }
}
class ElectricCar extends Car{
    private int batterySize;
    public double avgKmPerCharge;

    public ElectricCar(String description, int batterySize, double avgKmPerCharge) {
        super(description);
        this.batterySize = batterySize;
        this.avgKmPerCharge = avgKmPerCharge;
    }
}

class HybridCar extends Car{
    private int batterySize;
    private int cylinder;
    public double avgKmPerLitre;

    public HybridCar(String description, int batterySize, int cylinder, double avgKmPerLitre) {
        super(description);
        this.batterySize = batterySize;
        this.cylinder = cylinder;
        this.avgKmPerLitre = avgKmPerLitre;
    }
}