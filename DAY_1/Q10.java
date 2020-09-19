import java.util.Scanner;
class Q10{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Temperature in Fahrenheit");
		double F = sc.nextDouble();
		
		double C = 5*(F-32)/9 ;
		System.out.println("Temperature in Celsius = "+C);
	}
}
