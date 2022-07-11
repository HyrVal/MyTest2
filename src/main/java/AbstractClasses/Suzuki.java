package AbstractClasses;

    public class Suzuki extends Cars{
    String model = "SX";
     int maxSpeed = 200;

    public void typeMotor() {
        System.out.println("Type motor - gas");
        System.out.println("--overwrite method--");

    }

   @Override
    public void weightCar() {
        System.out.println("Car model - "+ model);
        System.out.println("Max speed - "+ maxSpeed);
        System.out.println("- method from abstract class -");
    }

}
