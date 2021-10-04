import java.util.Scanner;
public class Replace{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String k = sc.nextLine();
		int l = k.length();
		System.out.println("The new replaced string is :");
		k = k.replace("a","*");
		k = k.replace("e","*");
		k = k.replace("i","*");
		k = k.replace("o","*");
		k = k.replace("u","*");
		System.out.println(k);

		
}
} 