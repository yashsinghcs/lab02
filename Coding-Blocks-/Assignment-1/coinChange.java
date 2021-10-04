import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class coinChange {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		int[][] dp = new int[n + 1][a + 1];
		for(int[] row : dp) {
			Arrays.fill(row, -1);
		}
		
		System.out.println(sol(arr, n, a, dp));
	}

	private static int sol(int[] coins, int n, int amount, int[][] dp) {	
		if(amount == 0) {
			return 1; 
		}
		
		if(n == 0) {
			return 0;
		}
		
		if(dp[n][amount] != -1) {
			return dp[n][amount];
		}
		int inc = 0, exc = 0;
		
		if(coins[n - 1] <= amount) {
			inc = sol(coins, n, amount - coins[n - 1], dp);
		}

		exc = sol(coins, n - 1, amount, dp);
		
		return dp[n][amount] = inc + exc;
	}

	

}