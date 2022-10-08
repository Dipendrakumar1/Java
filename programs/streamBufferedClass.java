import java.io.*;
public class streamBufferedClass {

    public static void main(String[] args)throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(read);
        System.out.println("Enter 1st Number: ");
        int a=Integer.parseInt(input.readLine());
        System.out.println("Enter 1st Number: ");
        int b=Integer.parseInt(input.readLine());
        int z=a+b;
        System.out.println("The sum of two number is: "+z);
    }
}
