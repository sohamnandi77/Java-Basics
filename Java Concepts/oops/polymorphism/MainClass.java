package oops.polymorphism;

public class MainClass {
  public static void main(String[] args){
    Dog d = new Dog();
    Pet p = d;
    // Animal a = d;

    // variable do not get overridded 
    System.out.println(d.name);
    System.out.println(p.name);

    // Run Time Polymorphism aka Late binding aka Dynamic Binding aka overriding
    d.walk();
    p.walk(); 

    // Compile Time Polymorphism aka Early binding aka Static Binding aka overloading
    greet();
    greet("hello");
  }  

  public static void greet(){
      System.out.println("hi, there");
  }
  
  public static void greet(String S){
      System.out.println(S);
  }
    
}
