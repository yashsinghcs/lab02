import java.util.Scanner;

public class firstIndex {

    private static int checkIndex(int[] arr , int c , int k){
        if(c == arr.length){
            return -1;
        }
        if(arr[c] == k){
            return c;
        }
        return checkIndex(arr, c+1, k);
	}


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] a = new int[len];

        for(int i=0; i<len; i++){
            a[i] = sc.nextInt();

        }
        int key = sc.nextInt();
        System.out.println(checkIndex(a,0,key));


        sc.close();
    }
}
