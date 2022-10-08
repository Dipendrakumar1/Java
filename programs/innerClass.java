public class innerClass {
    class inner{
        void display()
        {
            System.out.println("Hi i am method inside inner class.");
        }
    }

    void output()
    {
        
        inner obj=new inner();
        obj.display();
    }

    public static void main(String[] args) {
        innerClass ob=new innerClass();
        ob.output();
    }
}
