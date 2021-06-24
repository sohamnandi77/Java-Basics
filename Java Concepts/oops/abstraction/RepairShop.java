package oops.abstraction;

public class RepairShop {
    
    public static void repairCar(Car car){
        System.out.println("Car is repaired");
    }

    public static void main(String[] args){

        WagonR car1 = new WagonR();
        Audi car2 = new Audi();

        repairCar(car1);
        repairCar(car2);
    }
}
