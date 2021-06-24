package oops.inheritance;

public class Person {
    
    protected String name;

    public Person(String name) {
        this.name = name;
        System.out.println("Inside person class");
    }
    public void walk(){
        System.out.println("Person " + name + " is walking");
    }
    public void eat(){
        System.out.println("Person " + name + " is eating");
    }

    public static void laugh(){
        System.out.println("Person is laughing");
    }
}
