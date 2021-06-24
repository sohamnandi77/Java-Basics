package oops.inheritance;

public class MainClass {
    public static void main(String[] args) {
        Teacher T = new Teacher("Harry");
        T.eat();
        T.walk();
        T.teach();

        Singer S = new Singer("Arijit");
        S.name = "Arijit";
        S.eat();
        S.walk();
        S.sing();

        // Upcasting and Downcasting
        Teacher T1 = new Teacher("Shivani");
        Singer S1 = new Singer("Shreya");
        
        // Person P = S1;

        Person P = T1;
        Teacher t = (Teacher)P;

        System.out.println(T1 instanceof Teacher);
        System.out.println(S1 instanceof Singer);
        System.out.println(T1 instanceof Person);
        System.out.println(t instanceof Person);
        System.out.println(P instanceof Teacher);
    }
}
