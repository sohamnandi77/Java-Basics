package oops.inheritance;

public class Singer extends Person {
    public Singer(String name) {
        super(name);
    }

    public void sing() {
        System.out.println(name +" is Singing");
    }

    // method overriding
    
    public void eat(){
        System.out.println("Singer " + name + " is eating");
    }

    public void walk(){
        System.out.println("Singer " + name + " is walking");
    }

    public static void laugh(){
        System.out.println("Person is laughing");
    }
}
