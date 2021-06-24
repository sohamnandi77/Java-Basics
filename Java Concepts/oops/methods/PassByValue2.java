package oops.methods;

public class PassByValue2 {
    public static void main(String[] args){

        // Dog c = new Dog();
        // c.legs = 4;
        // Dog d = new Dog();
        // d.legs = 3;
        // swap(c,d);
        // System.out.println(c.legs + " "+ d.legs);


        Dog a  = new Dog();
        a.legs = 4;
        change(a);
        System.out.println(a.legs);
    }

    static void swap(Dog a, Dog b){
        Dog temp = a;
        a = b;
        b = temp;
    }

    static void change(Dog dog){
        dog.legs = 6;

    }
}

class Dog{
    int legs;
}