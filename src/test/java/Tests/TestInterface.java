package Tests;
import Interfaces.Animal;
import Interfaces.InfoObject;
import Interfaces.Person;
import org.testng.annotations.Test;

public class TestInterface {

@Test
    public void runTestInterface() {

        InfoObject infoInterface1= new Animal(1);
        InfoObject infoInterface2= new Person("Alex");

        infoInterface1.showInfo();
        infoInterface2.showInfo();
    System.out.println("======================");
    System.out.println("end TestInterface suit");
    }

}
