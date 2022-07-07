package InterfacesAndClasses;

public class Line implements InfoGeometricFigures{
    String A;
    String B;
public Line (String A, String B){
    this.A=A;
    this.B=B;
}

    public void getLinePoint(){
        System.out.println("Points a line segment (A and B): ");
    }

    @Override
    public void showInfoGeometricFigures() {
        System.out.println("Points a line segment " + this.A +"-"+ this.B);
        System.out.println("(this is interface 2)");
    }
}
