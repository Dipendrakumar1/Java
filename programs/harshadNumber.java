import java.util.*;

public class harshadNumber {
//    Harshad number is a number which is divisible by sum of its digit itself.
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        // logic for checking harshasd number
        int temp=num;
        int sum=0;
        while(num!=0)
        {
            sum=sum+num%10;
            num=num/10;
        }
        if(temp%sum==0)
        {
            System.out.println("Given Number Is A Harshadd Number.");
        }
        else
            System.out.println("Given Number Is Not A Harshadd Number.");
    }
}
