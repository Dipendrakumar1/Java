import java.util.*;
public class arithemeticOperations {
    void menudriven()
    {
        System.out.println("====Choice Menu====");
        System.out.println("1.For Addition");
        System.out.println("2.For Subtraction");
        System.out.println("3.For Multiplication");
        System.out.println("4.For Division");
        System.out.println("5.Quit");
        System.out.println("Please,enter your choice: ");
    }
//    void input()
//    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter 1st Number: ");
//        a=sc.nextInt();
//        System.out.println("Enter 2nd Number: ");
//        b=sc.nextInt();
//    }
    int addition(int a,int b)
    {
        return a+b;
    }int subtraction(int a,int b)
    {
        return a-b;
    }int multiplication(int a,int b)
    {
        return a*b;
    }int division(int a,int b)
    {
        return a/b;
    }
    public static void main(String[] args) {
           arithemeticOperations ob=new arithemeticOperations();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int  b=sc.nextInt();
           int x=1;
           while(x==1)
           {

               ob.menudriven();
               int choice=sc.nextInt();
               switch (choice)
               {
                   case 1:
                       System.out.println("The Sum Of Two Numbers: "+ob.addition(a,b));
                       break;
                   case 2:
                       System.out.println("The Subtraction Of Two Numbers: "+ob.subtraction(a,b));
                       break;
                   case 3:
                       System.out.println("The Subtraction Of Two Numbers: "+ob.multiplication(a,b));
                       break;
                   case 4:
                       System.out.println("The Subtraction Of Two Numbers: "+ob.division(a,b));
                       break;
                   case 5:
                       System.exit(0);
                       break;
                   default:
                       System.out.println("Wrong Input!!!");

               }
               System.out.println("Do you want to continue(y=1/n=0): ");
               x=sc.nextInt();
           }
    }
}
