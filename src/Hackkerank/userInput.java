import java.util.Scanner;
class userInput
{
	public static void main(String [] args)
	{
		
		String name;
		String gender;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		name = sc.nextLine();
		System.out.println("Enter gender");
		gender = sc.nextLine();
		System.out.println("your age" + age);
		System.out.println("your age" + name);
		System.out.println("your age" + gender);
	}
}