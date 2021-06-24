package basics;

public class DataTypes {
    public static void main(String[] args){
        // byte has 8 bytes
        byte myByte = 2;
        System.out.println(myByte);
        byte newByte  = (byte) (myByte/2);
        System.out.println(newByte);
        
        // short has 16 bytes
        short myShort = 123; 
        System.out.println(myShort);
        short newShort  = (short) (myShort/2);
        System.out.println(newShort);

        // int has 32 bytes
        int myInt = 1_000_000_000;
        System.out.println(myInt);
        int newInt  = (myInt/2);
        System.out.println(newInt);

        // long has 64 bytes
        long myLong = 4566L;
        System.out.println(myLong);
        long newLong = (myLong/2);
        System.out.println(newLong);
        
        // float has 32 bytes
        float myFloat = 5f;
        System.out.println(myFloat);
        float newFloat = (float) (myFloat/2);
        System.out.println(newFloat);
        
        // double has 64 bytes
        double myDouble = 5.25d;
        System.out.println(myDouble);
        double newDouble = (myDouble/2);
        System.out.println(newDouble);
    

        // char has 2 bytes
        char myChar = 'a';
        System.out.println(myChar);
        char myUnicodeChar = '\u00A9';
        System.out.println(myUnicodeChar);
        
        // boolean has 1 bytes
        boolean myBoolean = false;
        System.out.println(myBoolean);
        
    }
}
