package oops.interfaces;

public class Person implements Student, YouTuber{
    public static void main(String[] args){
        Person obj = new Person();
        obj.study();
        obj.makeVideo();

        // We can't instantiate an interface in java
        // interface has no constructor
        // YouTuber obj2 = new YouTuber(); 

        // it is not initization .. it is upcasting
        YouTuber obj2 = obj;
        obj2.editVideo();
        obj2.makeVideo();

    }


    @Override
    public void study(){
        System.out.println("Person is Studing");
    }
    @Override
    public void makeVideo(){
        System.out.println("Person is making video");
    }
    @Override
    public void editVideo(){
        System.out.println("Person is editing video");
    }

}

