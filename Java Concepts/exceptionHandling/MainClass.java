package exceptionHandling;

public class MainClass {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
        int c = a/b;
        System.out.println(c);
    }catch (ArithmeticException e){
        System.out.println(e.getMessage() + " occured, please check your code");
    }finally{
        System.out.println("Finally block");
    }

    System.out.println("Very Important code");
    }

}
