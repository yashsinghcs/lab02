package question5;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value % 2 == 0) {
            System.out.println("Even");

        } else {
            System.out.println("Odd");
        }
    }
}
