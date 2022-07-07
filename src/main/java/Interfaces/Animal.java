package Interfaces;

public class Animal implements InfoObject {
    public int id;

    public Animal(int id){

        this.id=id;
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }

    @Override
    public void showInfo() {
        System.out.println("Animal id = " + this.id);
        System.out.println("(this is interface 3)");
    }
}
