import java.util.Scanner;

/**
 * andOr
 */
public class andOr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = a;

        while (k-- > 0) {

            if (k % 2 != 0) {
                res = res & b;

            } else {
                res = res | b;

            }
        }
        System.out.println(res);

        sc.close();
    }
}