package Tests;

import InterfacesAndClasses.InfoGeometricFigures;
import InterfacesAndClasses.Line;
import InterfacesAndClasses.Point;
import org.testng.annotations.Test;

public class TestSimpleFigures {
@Test
    public void runTestSimpleFigure () {
//  1 variant object creation
        InfoGeometricFigures pointA = new Point(2,3);
//  2 variant object creation
//      Point pointA= new Point(2, 3);
        Line lineAB = new Line("A","B");

        pointA.showInfoGeometricFigures();
        lineAB.showInfoGeometricFigures();

   }
}

