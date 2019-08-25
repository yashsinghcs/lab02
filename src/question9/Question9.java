package question9;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char value = input.nextLine().trim().charAt(0);
        if (Character.isLowerCase(value)) {
            value = Character.toUpperCase(value);
            System.out.println(value);
        } else {
            System.out.println(Character.toLowerCase(value));
        }


    }
}
