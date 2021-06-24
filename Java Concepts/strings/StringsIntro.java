package strings;
public class StringsIntro {
    public static void main(String[] args) {
        
        String name = "Anuj"; // String Pool area
        String name2 = "Anuj"; // String Pool area
        String name3 = new String("Anuj"); // heap area
        String name4 = new String("Anuj"); // heap area
        
        System.out.println(name == name2); // True  
        System.out.println(name == name3); // False
        System.out.println(name3 == name4); //False

        name = "Kumar"; // Strings are immutable, so "kumar" doesn't replace "Anuj" 
    }
}
