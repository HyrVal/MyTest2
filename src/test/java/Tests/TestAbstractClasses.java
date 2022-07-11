package Tests;

import AbstractClasses.*;
import org.testng.annotations.Test;

@Test
public class TestAbstractClasses {
    Suzuki suzuki=new Suzuki();
    Toyota toyota=new Toyota();
    Dog dog = new Dog();
    Cat cat=new Cat();
    Circle circle=new Circle();
    Oval oval= new Oval();

    public void getInfoAboutCar(){
        suzuki.typeMotor();
        suzuki.weightCar();
        toyota.typeMotor();
        toyota.weightCar();
        dog.getCharacteristicAnimals();
        cat.getCharacteristicAnimals();
        oval.getFigure();
        circle.getFigure();
    }
}
