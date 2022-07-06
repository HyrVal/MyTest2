package InterfacesAndClasses;

public class Point implements InfoGeometricFigures{
    public int coordinateX;
    public int coordinateY;

    public Point(int coordinateX, int coordinateY){
        this.coordinateX=coordinateX;
        this.coordinateY=coordinateY;
    }


    public void getCoordinates(){
        System.out.println("Point coordinates (X-Y): ");
    }
//    public void
    public void showInfoGeometricFigures(){
        System.out.println("Point coordinates A(" + this.coordinateX + "," + this.coordinateY+")");
    }

}
