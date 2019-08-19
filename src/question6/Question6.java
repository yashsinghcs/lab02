package question6;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char value1 = scanner.next().trim().charAt(0);
        char value2 = scanner.next().trim().charAt(0);


        if (Character.toLowerCase(value1) > Character.toLowerCase(value2)) {
            System.out.println(value2 + " " + value1);

        } else {
            System.out.println(value1 + " " + value2);
        }
    }
}
