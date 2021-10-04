import java.util.*;
public class minNoOfSubsequence {
	public static void patt(char[] arr){
		Stack<Integer> st = new Stack<>();
		int len = arr.length;

		for(int i=0; i <= len; ++i){
			st.push(i + 1);

			if(i == len || arr[i] == 'I')
				while(!st.isEmpty())
					System.out.print(st.pop());
		}
		System.out.println();
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int len = sc.nextInt();
		sc.nextLine();
		String[] s = sc.nextLine().split(" ");
	
		for(int i=0; i<len; ++i)
			patt(s[i].toCharArray());
    }
}