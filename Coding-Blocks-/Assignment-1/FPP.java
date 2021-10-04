import java.util.*;
public class FPP {
	private static long fPp(int n,long[] a){
        if(n==0 || n==1 ||n==2){
            return n;
        }
        if(a[n]!=-1){
            return a[n];
        }
        long c1=fPp(n-1,a);
        long c2=fPp(n-2,a);
        return a[n]=c1+(n-1)*c2;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            long[] arr=new long[n+1];
            Arrays.fill(arr,-1);
            long ans=fPp(n,arr);
            System.out.println(ans);
        }
    
    }
}