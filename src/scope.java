import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;
    public int diff;

    public Difference(int[] a) {
        this.elements = a;
    }

    public int computeDifference(){
        for (int i = 0; i < elements.length-1; i++) {
            for (int j = i+1; j < elements.length; j++) {
                if(elements[j]>elements[i]){
                    diff = elements[j]-elements[i];
                }else{
                    diff = elements[i]-elements[j];
                }
                if(maximumDifference<diff){
                    maximumDifference = diff;
                }
            }
        }
        return maximumDifference;
    }
} // End of Difference class

public class scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter Array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print("Maximum difference of two elements in array is: "+difference.maximumDifference);
    }
}