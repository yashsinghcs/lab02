import java.util.Scanner;

public class reverseArray {
    private static void reverse(int[] arr, int curr, int n) {
		

		if(curr == n) {
			return;
		}
		reverse(arr, curr+1, n); 
		System.out.print(arr[curr]+" ");
	}
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int len = sc.nextInt();
        int [] a = new int[len];
        for(int i =0; i<len; i++){
            a[i] = sc.nextInt();
        }
        reverse(a , 0 , len);
    }
}
