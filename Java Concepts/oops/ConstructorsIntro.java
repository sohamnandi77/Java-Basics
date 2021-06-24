package oops;

class Vehicle{
    int wheels;
    int mirrors;
    String color;

    // Parameterised Constructor
    
    // Vehicle(int noOfWheels){
    //     wheels = noOfWheels;
    //     mirrors = 2;
    // }

// we can't use default constructor if we define a constructor
// to use default constructor we have to define it

// Vehicle(){}

    Vehicle(int wheels){
        this.wheels = wheels;
        mirrors = 2;
    }
    
    // Constructor overloading
    Vehicle(int wheels, String color){
        this.wheels = wheels;
        this.color = color;
        mirrors = 2;
    }
}

public class ConstructorsIntro{
    
    // constructor called - no argument constructor
    ConstructorsIntro() {
        System.out.println("object is now created");
    }

    public static void main(String[] args){

        // ConstructorsIntro obj = new ConstructorsIntro();

        Vehicle car = new Vehicle(4);
        Vehicle bike = new Vehicle(2);
        Vehicle rickshaw = new Vehicle(3,"Blue");
        System.out.println(car.wheels + " "+ car.mirrors);
        System.out.println(bike.wheels + " "+ bike.mirrors);
        System.out.println(rickshaw.wheels + " "+ rickshaw.color);

    }

}