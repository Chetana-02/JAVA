import java.util.Scanner;
class Q8{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Principle Amount");
		float P = sc.nextFloat();
		System.out.println("Principle Amount = "+P+'\n');
		
		System.out.println("Enter Rate of Interest");
		float R = sc.nextFloat();
		System.out.println("Rate of Interest = "+R+'\n');
		
		System.out.println("Enter Time");
		float T = sc.nextFloat();
		System.out.println("Time = "+T+'\n');
		
		float SI = (P * R * T)/100;
		System.out.println("Simple Interest = "+SI);
		
	}
}