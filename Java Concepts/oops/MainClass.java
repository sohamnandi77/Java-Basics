package oops;
class Dog{
    String breed, name;
    public void jump(){
        System.out.println("my dog "+ name + " jumped");
    }
    public void description(){
        System.out.println("my dog's name is "+ name + " and it's breed is "+ breed);
    }
}


class Cat{ //camel casing
    boolean hasFur;
    String color, breed;
    int legs=4,eyes=2;

    public void walk(){
        System.out.println("Cat is walking");
    }

    public void eat(){
        System.out.println("Cat is eating");
    }

    public void description(){
        System.out.println("my cat has "+ legs + " legs and " + eyes + " eyes");
    }
}

public class MainClass{
    public static void main(String[] args){
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        // cat1.walk();
        // cat2.eat();

        cat2.legs = 3;
        cat2.eyes = 1;

        cat1.description();
        cat2.description();

        Dog husky = new Dog();
        Dog pug = new Dog();
        
        husky.breed = "Husky";
        husky.name = "Browny";

        pug.breed = "Pug";
        pug.name = "vodafone wala kutta";

        husky.jump();
        husky.description();
        
        pug.jump();
        pug.description();

    }
}