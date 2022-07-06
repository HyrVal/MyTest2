package Tests;

import InterfacesAndClasses.Line;
import InterfacesAndClasses.Point;

public class TestInterfacesSimpleFigures {

    public static void main(String[] args) {
// method Interfaces
        Point pointA= new Point(2, 3);
        Line lineAB = new Line("A","B");
pointA.showInfoGeometricFigures();
lineAB.showInfoGeometricFigures();


// method classes
//        pointA.getCoordinates();
//        lineAB.getLinePoint();
   }
}

