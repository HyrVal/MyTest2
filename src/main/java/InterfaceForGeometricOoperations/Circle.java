package InterfaceForGeometricOoperations;

public class Circle implements OperationForGeometricFigures {
    int a;
    String Pi;

    public Circle (String Pi, int a ){
        this.Pi=Pi;
        this.a=a;
    }
    public void getLongCircle(){
        System.out.println("Long circle = 2" +Pi+ " * "+a); ;

    }

    @Override
    public void calculateGeometricFigures() {
        System.out.println("Long circle = 2" + this.Pi + " * " + this.a);
        System.out.println("(this is interface 1)");
    }
}

