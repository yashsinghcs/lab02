
import java.util.*;
public class ONKnapsack {
	public static int KnapsackTD(int[] wt, int[] price, int vidx, int cap, int[][] strg) {

		if (vidx == wt.length || cap == 0) {
			return 0;
		}

		if (strg[vidx][cap] != 0) {
			return strg[vidx][cap];
		}

	
		int e = KnapsackTD(wt, price, vidx + 1, cap, strg);

		
		int i = 0;

		if (cap >= wt[vidx])
			i = KnapsackTD(wt, price, vidx , cap - wt[vidx], strg) + price[vidx];

		int ans = Math.max(e, i);

		strg[vidx][cap] = ans;

		return ans;

	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int capacity = sc.nextInt();
		int weight[] = new int[n];
		int price[] = new int[n];

		for(int i = 0;i < n;i++){
			weight[i] = sc.nextInt();
		}

		for(int i = 0;i < n;i++){
			price[i] = sc.nextInt();
		}

		System.out.println(KnapsackTD(weight, price, 0, capacity, new int[weight.length][capacity + 1]));
    }

	
}