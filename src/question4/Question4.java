package question4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value > 0) {
            System.out.println("Positive");
        } else if (value < 0) {
            System.out.println("Negative");

        } else {
            System.out.println("Zero");
        }
        scanner.close();
    }
}