import java.util.*;
public class lexicoGrapical {

	private static void lexicoPrint(int start, int end) {
		
		
		if(start > end) {
			return;
		}
		
		System.out.print(start+" ");
		int callDigit = 0;
		if(start == 0) {
			callDigit = 1;
		}
		
		while(callDigit <= 9) {
			lexicoPrint(start * 10 + callDigit, end);
			callDigit++;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		lexicoPrint(0, n);
	}

}