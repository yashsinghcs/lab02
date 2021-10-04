import java.util.Scanner;

public class stringToInteger {

    static int stringToInt(String str) {

        if (str.length() == 1)
            return (str.charAt(0) - '0');

        double y = stringToInt(str.substring(1));

        double x = str.charAt(0) - '0';

        x = x * Math.pow(10, str.length() - 1) + y;
        return (int) (x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(stringToInt(str));

        sc.close();
    }
}