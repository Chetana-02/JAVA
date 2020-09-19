import java.util.Scanner;
class Q15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your gender : M/F");
		String gender = sc.next();
		System.out.println("Gender = "+gender+'\n');

		System.out.println("Enter your age");
		int age  = sc.nextInt();
		System.out.println("Age = "+age+'\n');
		
		if (gender =="F" || age >= 18)
			System.out.println("You are eligible for marriage");
		
		else if(gender =="M" || age >= 21)
			System.out.println("You are eligible for marriage");
		
		else
		    System.out.println("You are not eligible for marriage");

	}
}
		
		