import java.util.Scanner;
public class array1D {
    void displayArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
            System.out.println(" "+arr[i]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int sz=sc.nextInt();
        int arr[]=new int[sz];
        System.out.println("Enter "+sz+" elements in array: ");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        System.out.println("====The Given Array====");
        array1D ob=new array1D();
        ob.displayArray(arr);
    }
}

