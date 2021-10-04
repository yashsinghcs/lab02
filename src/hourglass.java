import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hourglass {
    public static void main(String[] args) {
//        List<List<Integer>> arr = new ArrayList<>();
        int arr[][] = new int[6][6];

        int hourglass[][] = new int[4][4];
        int max;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2D array of size 6*6: ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j]= sc.nextInt();
            }
        }

        max = arr[0][0] + arr[0][1] + arr[0][2] + arr[1][1] + arr[2][0] + arr[2][1] + arr[2][2];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                hourglass[i][j] = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(hourglass[i][j]>max){
                    max = hourglass[i][j];
                }
            }
        }
        System.out.println("Maximum hourglass sum is: "+max);

    }
}
