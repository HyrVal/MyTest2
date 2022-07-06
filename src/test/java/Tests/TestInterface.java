package Tests;
import Interfaces.Animal;
import Interfaces.InfoInterface;
import Interfaces.Person;
import org.testng.annotations.Test;

public class TestInterface {
    @Test
    public static void main(String[] args) {
//        Animal animal1=new Animal(1);
//        Person person1=new Person("Alex");

//        animal1.sleep();
//        person1.sayHello();
//    animal1.showInfo();
//    person1.sayHello();

        InfoInterface infoInterface1= new Animal(1);
        InfoInterface infoInterface2= new Person("Alex");

        infoInterface1.showInfo();
        infoInterface2.showInfo();

    }

//    public static void outputInfo (InfoInterface infoInterface){
//
//    }
}
