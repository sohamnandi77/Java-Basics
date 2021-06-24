package oops.methods;

public class MethodOverloading {
    public static void main(String[] args){

    }

    static int maxOf(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    // method overloading -- same name methods
    static int maxOf(int a, float b){
        return 0;
    }

}



