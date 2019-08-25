package question11;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int srange = input.nextInt();
        int erange = input.nextInt();
        for (int i = srange + 1; i < erange + 1; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }

    }
}
