package Class;
import java.util.*;
public class lastSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        int m = Math.abs(sc.nextInt());
        int one=0;
        int two=0;
        one = n%10;
        two =m%10;
        int sum=0;
        sum = one + two;
        System.out.println((sum));
        

        sc.close();
    }
    
}