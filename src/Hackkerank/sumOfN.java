package Recursion;

public class sumOfN {
    
    public int sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return sum(n-1)+n;
        }
    }
    public static void main(String[] args) {
        sumOfN obj = new sumOfN();
        int r=0;
        r = obj.sum(5);
        System.out.println(r);
    }
}
