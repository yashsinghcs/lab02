package Class;
import java.util.*;

/**
 * frequency
 */
public class frequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.println("Enter the length of the array");
        len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements of the array");
        for(int i =0; i<=len-1; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<=len-1; i++ ){
            int count=0;
            for(int j=i+1; j<=len-1; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                else{
                    continue;
                }
            }
            System.out.println(count);
        }

    }
}