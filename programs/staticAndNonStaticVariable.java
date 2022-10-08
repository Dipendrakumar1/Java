public class staticAndNonStaticVariable {
    int x=0;
    static int y=0;
     void display() // static variable stored updated value for new object.
    {
        x++;
        y++;
        System.out.println(x);
        System.out.println(y);
    }
      void print()
    {
        x++;
        y++;
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
         staticAndNonStaticVariable ob=new staticAndNonStaticVariable();
         staticAndNonStaticVariable ob1=new staticAndNonStaticVariable();
        ob.display();
       // ob.print();
        ob1.display();
      //  ob1.print();
    }
}
