import java.util.Scanner;
class Q6{
	public static void main(String args[]){
		double pi = 3.14,Area,C,r;
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter radius of Circle");
		r = a.nextDouble();
		System.out.println("Radius = "+r);
		
		Area = pi * r * r;
		System.out.println("Area = "+Area);	

		C = 2*pi*r;
		System.out.println("Circumference = "+C);				
	}
}
