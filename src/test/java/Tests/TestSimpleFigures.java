package Tests;

import InterfacesAndClasses.InfoGeometricFigures;
import InterfacesAndClasses.Line;
import InterfacesAndClasses.Point;
import org.testng.annotations.Test;

public class TestSimpleFigures {
@Test
    public void runTestSimpleFigure () {
TeatInit pauseCycle = new TeatInit();
    //  1 variant object creation
        InfoGeometricFigures pointA = new Point(2,3);
//  2 variant object creation
//      Point pointA= new Point(2, 3);

        Line lineAB = new Line("A","B");
for (int i =0; i<9 ; i++) {
    int c = i;

        pointA.showInfoGeometricFigures();
        lineAB.showInfoGeometricFigures();
    System.out.println("Cycle nomber " + c);
    System.out.println("end TestSimpleFigures suit");
    pauseCycle.sleep(1);
}
   }
}

