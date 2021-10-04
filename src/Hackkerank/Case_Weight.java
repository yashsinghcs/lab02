import java.util.Scanner;
public class Case_Weight{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String k = sc.nextLine();
		int l = k.length();
		System.out.println("The  Upperweight of the string is :");
		int sum = 0;
		
		for (int i =0; i <=l-1; i++)
		{	if(k.charAt(i)>=65 && k.charAt(i)<=90)
			 sum+= k.charAt(i);
			else
				sum+=0;
		}
		 
		System.out.println(sum);
			

		
}
} 