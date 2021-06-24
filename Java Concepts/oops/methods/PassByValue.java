package oops.methods;

public class PassByValue {
    public static void main(String[] args){
        int c = 10;
        int d = 20;
        System.out.println(c + " "+ d);
        swap(c,d);
        System.out.println(c + " "+ d);
    }

    static int swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        return 0;
        
    }
}
