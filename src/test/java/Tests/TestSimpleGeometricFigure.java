package Tests;

import InterfaceForGeometricOoperations.Circle;
import InterfaceForGeometricOoperations.Square;
import org.testng.annotations.Test;

import java.nio.channels.Pipe;

public class TestSimpleGeometricFigure {
   @Test
    public void getTestSimpleGeometricFigure () {
       Circle circle1 = new Circle("Pi", 3);
       Square square1 = new Square(2, 3);
       TeatInit pauseCycle = new TeatInit();

       for (int i = 0; i < 9; i++) {
           int c = i;
           circle1.calculateGeometricFigures();
//       circle1.getLongCircle();
           square1.calculateGeometricFigures();
           System.out.println("Cycle number ========" + c);
           System.out.println("end getTestSimpleGeometricFigure suit");
           pauseCycle.sleep(1);
       }
   }
}
