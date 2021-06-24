package oops.staticKeyword;
// import oops.statickeyword.A.B;
// import oops.statickeyword.A.C;

public class StaticKeyword {

    static {
        System.out.println("In Block 1");
    }

    static {
        System.out.println("In Block 2");
    }
    public static void main(String[] args) {

        // System.out.println(Math.PI);
        System.out.println("In Block main");

        // A objA = new A();
        // B objB = objA.new B();
        
        // C objC = new A.C();
    }
    static {
        System.out.println("In Block 3");
    }
}
