import java.util.*;

public class stockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n; i++){
			arr[i] = sc.nextInt();
		}

		int[] span = new int[n];

		span[0] = 1;

		Stack<Integer> st = new Stack<>(); //building ke indexes
		st.add(0);
		for (int curr = 1; curr < n; curr++) {

			//arr[st.peek] < arr[curr]
			
			while(!st.isEmpty() && arr[st.peek()] < arr[curr]) {
				st.pop();
			}
			
			//jaise hi tumhe prev greater building mil jaegi
			
			//span curr = curr Ind - Prev greater building ind
			
			span[curr] = st.isEmpty() ? curr + 1 : curr - st.peek();
			st.push(curr);
		}
		
		for(int e : span) {
			System.out.print(e + " ");
		}
		System.out.print("END");
	}

}