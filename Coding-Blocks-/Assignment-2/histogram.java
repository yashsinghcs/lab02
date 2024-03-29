import java.util.*;

public class histogram {

	static void Area(int[] heights){
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
    
        stack.push(0);
        left[0] = 0;
        for (int i = 1; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                left[i] = stack.pop();
            }
            left[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
            stack.push(i);
        }
        stack.clear();
    
        right[heights.length-1] = heights.length - 1;
        stack.push(heights.length-1);
        for (int i = heights.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                right[i] = stack.pop();
            }
            right[i] = stack.isEmpty() ? heights.length - 1 : stack.peek() - 1;
            stack.push(i);
        }
        long maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            long area = (long) heights[i] * (right[i] - left[i] + 1);
            maxArea = Math.max(area,maxArea);
        }
        System.out.println(maxArea);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        Area(heights);
    }
}