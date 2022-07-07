package Tests;

import InterfaceForGeometricOoperations.Circle;
import InterfaceForGeometricOoperations.Square;
import org.testng.annotations.Test;

import java.nio.channels.Pipe;

public class TestSimpleGeometricFigure {
   @Test
    public void getTestSimpleGeometricFigure (){
       Circle circle1 = new Circle ("Pi", 3);
       Square square1 = new Square(2,3);

       circle1.calculateGeometricFigures();
//       circle1.getLongCircle();
       square1.calculateGeometricFigures();
    }

}
