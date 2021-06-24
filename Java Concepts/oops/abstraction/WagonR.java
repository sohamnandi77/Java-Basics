package oops.abstraction;

public class WagonR extends Car{
    
    @Override
    public void acclerate(){
        System.out.println("WagonR is acclerating");
    }

    @Override
    public void breaking(){
        System.out.println("WagonR is breaking");
    }
}
