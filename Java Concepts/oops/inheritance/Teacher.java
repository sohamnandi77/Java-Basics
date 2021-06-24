package oops.inheritance;

public class Teacher extends Person{


    // constructor
    public Teacher(String name){
        super(name);
        System.out.println("Inside Teacher class");
    } 

    public void teach(){
        System.out.println(name + " is teaching");
    }

    // method overriding
    public void eat(){
        super.eat();
        System.out.println("Teacher " + name + " is eating");
    }

    public void walk(){
        System.out.println("Teacher " + name + " is walking");
    }

    public static void laugh(){
        System.out.println("Person is laughing");
    }
}
