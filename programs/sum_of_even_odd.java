import java.util.*;
public class sum_of_even_odd {
    public static void main(String[] args)
    {
        int sum_e=0;
        int sum_o=0;
       int  count_e=0;
       int  count_o=0;
      Scanner ob=new Scanner(System.in);
      int arr[]=new int[10];
      System.out.println("Enter 10 Elements: ");
      for(int i=0;i<10;i++)
      {
          arr[i]=ob.nextInt();
      }for(int i=0;i<10;i++)
      {
          if(arr[i]%2==0)
          {
              count_e++;
              sum_e=sum_e+arr[i];
          }
          else
          {
              count_o++;
              sum_o=sum_o+arr[i];
          }
      }
      System.out.println("The No Of Even: "+count_e);
      System.out.println("The No Of Odd: "+count_o);
      System.out.println("Sum Of Even: "+sum_e);
      System.out.println("Sum Of Odd: "+sum_o);
    }
}
