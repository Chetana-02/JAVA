import java.util.Scanner;
class Q7{
	public static void main(String args[]){
		int num = 5;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter English marks");
		float E = sc.nextFloat();
		System.out.println("Marks Obtained in English = "+E+'\n');
		
		System.out.println("Enter Maths marks");
		float M = sc.nextFloat();
		System.out.println("Marks Obtained in Maths = "+M+'\n');
		
		System.out.println("Enter Science marks");
		float S = sc.nextFloat();
		System.out.println("Marks Obtained in Science = "+S+'\n');
		
		System.out.println("Enter History marks");
		float H = sc.nextFloat();
		System.out.println("Marks Obtained in History = "+H+'\n');
		

		System.out.println("Enter Hindi marks");
		float Hi = sc.nextFloat();
		System.out.println("Marks Obtained in  = "+Hi+'\n');
		
		float sum = E + M + S + H + Hi;
		System.out.println("Sum of marks obtained = "+sum);	

		float per = (sum/1000) * 100;
	    System.out.println("Percentage marks = "+per+ '%');		
	}
}

		
		