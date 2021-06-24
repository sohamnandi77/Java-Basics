package oops.finalKeyword;

public class MainClass {
    
    // final global must be initialized during declaration
    // final String ROLL_NO; -- they are known as blank variable
    final int ROLL_NO = 12;
    public static void main(String[] args) {
        
        // final variable -- the can't be reinitialized
        final String name = "Anuj";
        // name = "Rahul";


        // local final variable -- can be declared without initializition 
        // they are known as blank variable
        final String gender;
        gender = "Male";
        

        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);

        // final reference variable
        final Student object = new Student();
        Student object2 = new Student();

        object.Address = "Delhi";
        object2.Address = "Mumbai";
        // object = object2;

    }
}
