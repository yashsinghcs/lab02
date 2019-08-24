package question7;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char value = input.nextLine().charAt(0);
        if (value > 'a' && value < 'z' || value > 'A' && value < 'Z') {
            System.out.println("alphabet");
        } else if (value > '0' & value < '9') {
            System.out.println("digit");
        } else {
            System.out.println("special character");
        }


    }
}
