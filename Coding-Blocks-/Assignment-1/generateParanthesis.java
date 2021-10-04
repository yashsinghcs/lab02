import java.util.*;
public class generateParanthesis {

	private static void genP(String ans, int oc, int cc, int n) {
		
		if(oc == n && cc == n) {
			System.out.println(ans);
			return;
		}
		if(oc > cc) {
			genP(ans + ')', oc, cc + 1, n);
		}
		
		
		if(oc < n) {
			genP(ans + '(', oc + 1, cc, n);
		}
		
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		genP("", 0, 0,n);
	}
}