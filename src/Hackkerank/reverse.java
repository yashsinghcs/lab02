package Class;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rev = sc.nextLine();
         System.out.println(rev);
        StringBuilder a = new StringBuilder();
        a = a.append(rev);
        a.reverse();
        System.out.println(a);


    }
}
