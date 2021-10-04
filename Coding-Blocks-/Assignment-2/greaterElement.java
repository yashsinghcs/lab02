import java.util.*;
public class greaterElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        while (i < n*2){
            while (!stack.isEmpty() && arr[i % n] > stack.peek()){
                map.put(stack.pop(), arr[i % n]);
            }
            stack.push(arr[i % n]);
            i++;
        }
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.print(map.getOrDefault(arr[i1],-1) + " ");
        }
    }
}