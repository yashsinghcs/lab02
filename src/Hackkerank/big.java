import java.util.Scanner;
class compareNo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int no1;
		int no2;
		int no3;
		System.out.println("Enter the integer no");
		no1 = sc.nextInt();
		no2 = sc.nextInt();
		no3 = sc.nextInt();
		if (no1>no2 && no1>no3)
		{
			System.out.println( no1 + " is greater");
		}
		else if ( no2>no3){
				System.out.println( no2 + " is greater");
				}
		else {
			System.out.println( no3 + " is greater");
		}
	}
}
			