import java.util.Scanner;
public class array2D {
    void displayNormalArray(int arr[][],int rs,int cls)
    {
        for(int i=0;i<rs;i++)
            for (int j=0;j<cls;j++)
                System.out.println(arr[i][j]);
    }
    void displayMatrixArray(int arr[][],int rs,int cls)
    {
        for(int i=0;i<rs;i++) {
            for (int j = 0; j < cls; j++) {
                System.out.print(" "+arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int rs=sc.nextInt();
        System.out.println("Enter no of columns: ");
        int cls=sc.nextInt();
        int arr[][]=new int[rs][cls];
        System.out.println("Enter "+rs*cls+" elements: ");
        for(int i=0;i<rs;i++)
            for (int j=0;j<cls;j++)
                arr[i][j]=sc.nextInt();

        array2D ob=new array2D();
        System.out.println("====Output In Normal Form====");
        ob.displayNormalArray(arr,rs,cls);
        System.out.println("====Output In Matrix Form====");
        ob.displayMatrixArray(arr,rs,cls);
    }
}
