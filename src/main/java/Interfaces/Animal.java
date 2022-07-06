package Interfaces;

public class Animal implements InfoInterface{
    public int id;

    public Animal(int id){

        this.id=id;
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }

    @Override
    public void showInfo() {
        System.out.println("It id =" + this.id);

    }
}