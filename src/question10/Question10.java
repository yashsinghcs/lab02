package question10;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        if (value == 1) {
            System.out.println("january");
        } else if (value == 2) {
            System.out.println("Febuary");

        } else if (value == 3) {
            System.out.println("March");

        } else if (value == 4) {
            System.out.println("April");

        } else if (value == 5) {
            System.out.println("May");

        } else if (value == 6) {
            System.out.println("June");

        } else if (value == 7) {
            System.out.println("July");

        } else if (value == 8) {
            System.out.println("August");

        } else if (value == 9) {
            System.out.println("Septmber");

        } else if (value == 10) {
            System.out.println("October");

        } else if (value == 11) {
            System.out.println("November");

        } else if (value == 12) {
            System.out.println("December");

        } else {
            System.out.println("Invalid input");

        }

    }
}
