import java.util.Scanner;
public class staticAndNonStaticBlock {

     static void display()
    {
        System.out.println("Hello , I am Static function.");
    }
    // static block executed when class is loaded into memory
    // Static block executed once
    // After Static block other blocks are executed
    static {
        System.out.println("Hey, I am Static block2.");
    }
    static {
        System.out.println("Hey, I am Static block.");
    }


    public static void main(String[] args) {
         // we can call static methods without creating object
        display();
    }
}
