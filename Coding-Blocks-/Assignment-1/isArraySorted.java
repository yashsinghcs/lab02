import java.util.Scanner;

public class isArraySorted {

     static boolean isSorted(int[] arr,int curr)
{
    if(curr>=arr.length-1)
    return true;
    if(arr[curr] > arr[curr+1]){
        return false;
        }
        else{
        boolean ans=isSorted(arr,curr+1);
        return ans;   
}
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int len = sc.nextInt();
		int [] n = new int[len];

		for(int i=0; i<len; i++){
			n[i] = sc.nextInt();
		}
        System.out.print(isSorted(n,0));

        sc.close();
		
    }
    
}

