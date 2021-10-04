import java.util.Scanner;

public class replacePie {

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();

            System.out.println(s.replaceAll("pi", "3.14"));
        }

        sc.close();
        
    }
}
