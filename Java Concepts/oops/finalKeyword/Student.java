package oops.finalKeyword;

public class Student {
    final int ROLL_NO;
    final String NAME;
    String Address;

    // ways to initialize blank variable
    // initilzer block
    // static block
    // constructor

    {
        ROLL_NO = 12;
    }

    public Student(){
        NAME = "Anuj";
    }


    // final methods
    public final void getDescription(){
        System.out.println("The student name is "+ NAME );
    }

}
