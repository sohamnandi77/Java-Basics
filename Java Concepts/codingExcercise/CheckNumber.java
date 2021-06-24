package codingExcercise;
public class CheckNumber{
    
    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("positive");
        }else if(number < 0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
    }

    public static void main(String[] args){
        checkNumber(-1);
        checkNumber(5);
        checkNumber(0);
    }


}