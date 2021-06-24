package patterns;
import java.util.Scanner;
public class CGIpattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = 1;
        for (int i = 1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(count++ + "*");
            }

            for(int j = 1;j<=n;j++){
                System.out.print("-");
            }

            // for (int j=1;j<=i;j++){
            //     System.out.print(count++ + "  ");
                
            // }
            
            System.out.println(); 
        }
    }
}