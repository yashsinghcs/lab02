import java.io.*;
import java.util.*;

public class letsReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str;
        int t = sc.nextInt();
        ArrayList<Character> s1=new ArrayList<Character>();
        ArrayList<Character> s2=new ArrayList<Character>();

        for (int i = 0; i < t; i++) {
            str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                if(j%2 == 0){
                    s2.add(str.charAt(j));
                }
                else{
                    s1.add(str.charAt(j));
                }
            }
            System.out.print(s2.toString().replaceAll("\\[|\\]|[,][ ]","")+" ");
            System.out.println(s1.toString().replaceAll("\\[|\\]|[,][ ]",""));
            s1.clear();
            s2.clear();

        }
    }
}