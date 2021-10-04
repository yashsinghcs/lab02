import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the no of terms");
        n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a +" ");
        System.out.print(b+" ");
        int c;

        for(int i = 0; i<n-2; i++){
            c = 0;
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;



        }
    }
}