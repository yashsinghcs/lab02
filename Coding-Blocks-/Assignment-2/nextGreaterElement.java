import java.util.*;

public class nextGreaterElement {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++)
				arr[i] = scn.nextInt();

			nextLarger(arr);

			t--;
		}

	}

	// Function to print Next Greater Element for each element of the array
	public static void nextLarger(int[] arr) {

        // Write Code here
        int n = arr.length;
        int[] nge = new int[n];
		
		Stack<Integer> st = new Stack<>();
		st.push(0);
		
		for(int curr = 1; curr < n; curr++) {
			
			while(!st.isEmpty() && arr[curr] > arr[st.peek()]) {
				nge[st.pop()] = arr[curr];
			}
			st.push(curr);
		}
		
		while(!st.isEmpty()) {
			nge[st.pop()] = -1;
		}
		for(int i = 0; i < n ; i++) {
			System.out.println(arr[i]+","+ nge[i]);
		}
	}
}