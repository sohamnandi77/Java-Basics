package oops.polymorphism;

public class Dog extends Pet {

    // variable do not get overridded 
    String name = "Dobby";

    public void walk(){
        System.out.println("Dog is walking");
    }
}
