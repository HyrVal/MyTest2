package InterfaceForGeometricOoperations;

    public class Square implements OperationForGeometricFigures {
    int a ;
    int b ;

        public Square (int a, int b){
        this.a = a;
        this.b = b;
    }
//public int getSquare (){
//    return a * b;
//}

    @Override
    public void calculateGeometricFigures() {

        System.out.println("Area of a square = " + this.a + "*" + this.b);
        System.out.println("(this is interface 1)");
//      Square(2,3);
//      public int getSquare(int 2, int 3){
//      return int c = a * b;
//      }
    }
}
