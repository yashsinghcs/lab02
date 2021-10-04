import java.util.Scanner;
public class Weight{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String k = sc.nextLine();
		int l = k.length();
		System.out.println("The weight of the string is :");
		int sum = 0;
		for (int i =0; i <=l-1; i++)
		{	
			 sum+= k.charAt(i);
		}
		System.out.println(sum); 
			

		
}
} 