package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car =new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari=new GasPoweredCar("2022 blue Ferrari", 15,6);
        runRace(ferrari);

        Car tesla =new ElectricCar("2022 Red Tesla Model 3",568,75);
        runRace(tesla);

        Car toyota =new HybridCar("2022 Toyota Hybrid Dream ",16,8,8);
        runRace(toyota);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();

    }
}
