import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
class customerDetail{
    String custName;
     double custPkg;
     int custAge;
   // int custNo;
     void setData()
     {
         Scanner sc=new Scanner(System.in);
        // for(int i=1;i<=custNo;i++)
        // {
             System.out.println("====Details Of Customer ====");
             System.out.println("Enter Name Of The Customer: ");
             custName=sc.nextLine();
             System.out.println("Enter Age Of The Customer: ");
             custAge=sc.nextInt();
             System.out.println("Enter Package Of The Customer: ");
             custPkg=sc.nextDouble();
         //}
     }
     void displayDetails()
     {
       //  for(int i=1;i<=custNo;i++)
       //  {
             System.out.println("====Details Of Customer ====");
             System.out.println("Name: "+custName);
             System.out.println("Name: "+custAge);
             System.out.println("Name: "+custPkg);

        // }
     }
}
public class customerClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of customers: ");
        //customerDetail ob=new customerDetail();
        int custNo=sc.nextInt();
        customerDetail obj[]=new customerDetail[custNo];
        for(int i=1;i<=custNo;i++)
        {
            obj[i]=new customerDetail();
            obj[i].setData();
        }
        for(int i=1;i<=custNo;i++)
        {
            obj[i].displayDetails();
        }

    }

}