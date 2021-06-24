package oops.abstraction;

public class Audi extends Car{
    @Override
    public void acclerate(){
        System.out.println("Audi is acclerating");
    }
    @Override
    public void breaking(){
        System.out.println("Audi is breaking");
    }
}
