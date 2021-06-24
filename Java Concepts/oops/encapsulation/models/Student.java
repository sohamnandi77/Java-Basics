package oops.encapsulation.models;

public class Student {
    
    private String name; //private is restricted to a particular class

    public Student(String name) {
        this.name = name;
    }

    // public method only visible within the class
    public String getName(){
        return name;
    }

    // private method only visible within the class
    // private String getPassword() {
    //     return "qwertyuiop";
    // }

    
    // Default method only visible within the package
    String getID() {
        return "123456";
    }
}
