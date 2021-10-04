import java.util.*;
public class classAssignment {
	public static int classAssign(int n){
		if(n == 1) return 2;
		if(n == 2) return 3;
		return classAssign(n-1) + classAssign(n-2);
	}

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++){
			int a = sc.nextInt();	
			int res = classAssign(a);
			System.out.println("#" + i + " : " + res);	
		}
    }
 
	
}