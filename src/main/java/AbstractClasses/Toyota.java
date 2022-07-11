package AbstractClasses;

public class Toyota extends Cars{
    String model = "Toyota";
    int maxSpeed = 240;

    @Override
    public void weightCar() {
        System.out.println("Car model - "+ model);
        System.out.println("Max speed - "+ maxSpeed);
        System.out.println("- method from abstract class -");
    }
}
