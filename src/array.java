import java.util.ArrayList;
import java.util.Scanner;

public class array {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        int arr[] = new int[n];

        for (int i = 0; i < n ; i++) {
            a = sc.nextInt();
            arr[i] = a;
        }

        for (int i = 0; i < n ; i++) {
            System.out.print(arr[n-1-i]+" ");
        }

    }
}
