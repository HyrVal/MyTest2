package Interfaces;

public class Person implements InfoObject {
    private String name;

    public Person(String name){
        this.name= name;
    }
    public void sayHello(){
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("Name is " + this.name);
        System.out.println("(this is interface 3)");
    }
}
