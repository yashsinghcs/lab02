package Recursion;

public class factorial {
    public int sum(int n){
        if(n==0){
            return 1;
        }
        else{
            return sum(n-1)*n;
        }
    }
    public static void main(String[] args) {
        factorial obj = new factorial();
        int r=0;
        r = obj.sum(5);
        System.out.println(r);
    }
    
}
