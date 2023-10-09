import java.util.*;
public class LIS {
	/**
     * Performs a binary search to find the correct position to insert an element in an array.
     *
     * @param lengthsEnding An array representing the lengths of increasing subsequences ending at each position.
     * @param si            Start index for the search.
     * @param ei            End index for the search.
     * @param item          The element to be inserted.
     * @return The index where the element should be inserted.
     */
    private static int binarySearch(int[] lengthsEnding, int si, int ei, int item) {
        int low = si;
        int high = ei;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (item > lengthsEnding[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    /**
     * Calculates the length of the Longest Increasing Subsequence (LIS) using bottom-up dynamic programming.
     *
     * @param arr An array of integers.
     * @return The length of the LIS.
     */
    public static int calculateLISLength(int[] arr) {
        int[] lengthsEnding = new int[arr.length];
        lengthsEnding[0] = arr[0];
        int len = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > lengthsEnding[len - 1]) {
                lengthsEnding[len] = arr[i];
                len++;
            } else {
                int idx = binarySearch(lengthsEnding, 0, len - 1, arr[i]);
                lengthsEnding[idx] = arr[i];
            }
        }

        return len;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int maxLength = calculateLISLength(arr);
            System.out.println("Length of Longest Increasing Subsequence: " + maxLength);
        } catch (InputMismatchException e) {
            // Handle input mismatch exception (e.g., non-integer input).
            System.err.println("Invalid input. Please enter integers only.");
        }
    }
	
}
