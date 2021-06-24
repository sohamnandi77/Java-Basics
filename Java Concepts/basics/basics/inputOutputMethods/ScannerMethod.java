package basics.inputOutputMethods;
import java.util.Scanner;
public class ScannerMethod {
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

     String s = sc.nextLine();
     int x = sc.nextInt();
     double y = sc.nextDouble();
     Short sh = sc.nextShort();
     long l = sc.nextLong();
     float f = sc.nextFloat();

     sc.close();
     
     System.out.println(s);
     System.out.println(x);
     System.out.println(y);
     System.out.println(sh);
     System.out.println(l);
     System.out.println(f);
     

     }
}
