package strings;
public class StringFunctions {
    public static void main(String[] args) {
        String name = "Soham Nandi";
        
        System.out.println(name.length()); // string length
        System.out.println(name.charAt(2)); // char at index
        System.out.println(name.indexOf("m")); // index of char

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.charAt(name.length()-1)); // to get last element of the str
        System.out.println(name.substring(1,3)); // substring
        System.out.println(name.substring(4,name.length())); // substring from n to end
        System.out.println(name.contains("am ")); // check if the str contains the given str
        
        String str1 = "Anuj";
        String str2 = new String("Kumar");

        System.out.println(str1.equals(str2));    // checks the values
        
        String str = "";
        System.out.println(str.isEmpty()); // checks if empty or not

        String spaceStr = "     Soham Nandi   ";
        System.out.println(spaceStr.trim());
        // Concatenate strings

        System.out.println(str1 + " " + str2);
        System.out.println(str1.concat(str2));

        System.out.println(str1.replace('A','C')); // replace

        String cars = "hyundai,maruti,Swift,Ferrari";
        String allCars[] = cars.split(",");
        
        for(String car : allCars){
            System.out.println(car);
        }



    }
}
