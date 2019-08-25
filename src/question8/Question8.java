/*@author Yash kumar sngh
 *version1.1
 */
package question8;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String gender = input.next();
        gender = gender.toLowerCase();
        System.out.println(gender);
        int age = input.nextInt();
        if (gender.equals("female") && age >= 1 && age < 59) {
            System.out.println("8.2%");
        } else if (gender.equals("female") && age > 58 && age < 101) {
            System.out.println("9.2%");
        } else if (gender.equals("male") && age >= 1 && age < 59) {
            System.out.println("8.4%");
        } else {
            System.out.println("10.5%");
        }
    }

}
