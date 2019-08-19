package question1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Welcome " + name + "!");
        input.close();
    }
}