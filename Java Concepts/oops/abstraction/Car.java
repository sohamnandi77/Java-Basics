package oops.abstraction;

public abstract class Car {
    
    // abstract methods
    public abstract void acclerate();

    public abstract void breaking();

    // concrete methods
    public void honk(){
        System.out.println("Car is honking");
    }
}
