package basics.inputOutputMethods;

import java.util.Scanner;

class Exponent {
    long power(long base, long power) {
        long result = 1;
        while (power > 0) {

            if (power % 2 == 1) {
                result = (result * base);
            }
            base = (base * base);
            power /= 2;
        }
        return result;
    }
}

public class Power {

    public static void main(String[] args) {
        Exponent base = new Exponent();
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();
        System.out.println(base.power(X, Y));
    }
}
