import java.util.*;
public class displayAlternativeNumber {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 10 Elements: ");
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++)
            arr[i] = ob.nextInt();
        System.out.println("=====Alternatives Output=====");
        for (int i = 0; i < 10; i = i + 2) {
            System.out.println(arr[i]);
        }
    }
}
