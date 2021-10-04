import java.util.*;

public class aggresiveCows {

	private static boolean canPlaced(int[] stalls, int numCows, int minDist) {
		

		int posPlaced = stalls[0]; //1
		int numPlaced = 1;
		
		for(int curr = 1; curr < stalls.length; curr++) {
			
			if(numPlaced == numCows) {
				return true;
			}
			if(stalls[curr] - posPlaced >= minDist) {
				numPlaced++;
				posPlaced = stalls[curr];
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cows = sc.nextInt();
		int[] stalls = new int[n];
		for(int i =0; i<n; i++){
			stalls[i] = sc.nextInt();
		}
		
		Arrays.sort(stalls);
		
		int l = 0;
		int r = stalls[n - 1] - stalls[0]; 
		
		while(r > l + 1) {
			int minDist = (l + r) / 2;
			
			if(canPlaced(stalls, cows, minDist)) {
				l = minDist;
			} else {
				r = minDist;
			}
		}
		
		System.out.println(l);
	}

}