import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String bin = Integer.toBinaryString(n);
        int count = 0;
//        System.out.println(bin.length());
        for (int i = 0; i < bin.length() ; i++) {
            int flagCount = 0;
            if (bin.charAt(i)=='1'){
                while (i< bin.length() && bin.charAt(i)=='1'){
                    flagCount++;
                    i++;
                }
                if (flagCount > count){
                    count = flagCount;
                }
            }
        }
        System.out.print("Number of consecutive 1s in binary of "+n+" is: "+count);
//        System.out.println(count);
    }
}
