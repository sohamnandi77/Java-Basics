package oops.finalKeyword;

// final class can't be extended 
public final class Subject extends Student {

    // we can't override final method

    // public void getDescription(){
    //     System.out.println("Override the getDescription method");
    // }

    public static void main(String[] args) {
        
        Subject subject = new Subject();
        subject.getDescription();
    }
}
