package patterns;
import java.util.Scanner;
public class SquarePattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int j =1; j<=n;j++){
        for(int i =1; i<=n;i++){
            System.out.print("* ");
        }
        System.out.println("");
    }
    }
}