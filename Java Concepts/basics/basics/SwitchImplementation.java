package basics;
public class SwitchImplementation {
    public static void main(String[] args) {
        int dayOfWeek = 2;
        switch(dayOfWeek) {
            case 1:
                System.out.println("I'm on leave");
                break;
            case 2:
                System.out.println("I'm in office");
                break;
            case 3:
                System.out.println("I'm playing football");
                break;

                default:
                System.out.println("I don't know what day it is'");
        }
    }
    
}
