import java.util.*;
class circle{
   float setDim(float d)
   {
     float rad=d/2;
     return (float)rad;
   }
}
class application{
    void menu()
    {
        System.out.println("====Choice Menu====");
        System.out.println("1.Area of cirlce");
        System.out.println("2.Perimeter of cirlce");
        System.out.println("3.Quit");
    }
    float findArea( float rd)
    {
          return (float)(3.14*rd*rd);
    }
    float findPerimeter(float rd)
    {
       return  (float)(2*3.14*rd);
    }

}

public class main_area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter diameter of the circle: ");
        float d=sc.nextFloat();
        circle ob1= new circle();
        int x=1;
        while(x==1)
        {
            float rd= ob1.setDim(d);
            application ob2=new application();
            ob2.menu();
            System.out.println("Enter your choice: ");
            int ch=sc.nextInt();
            if(ch==1)
            {
                System.out.println("The area of the circle is: "+ob2.findArea(rd));
            }
            else if(ch==2)
            {
                System.out.println("The perimeter of the circle is: "+ob2.findPerimeter(rd));
            }
            else if(ch==3)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Wrong Input!!!");
            }
            System.out.println("Do you want to continue(y=1/n=0): ");
            x=sc.nextInt();
        }


    }
}
