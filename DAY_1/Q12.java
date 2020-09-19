import java.util.Scanner;
class Q12{
	public static void main(String args[]){
		float HRA,DA,GRS;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Salary");
		float sal = sc.nextFloat();
		System.out.println("Salaray = "+sal);
		
		if (sal  < 10000)
		{
				HRA = 0.1F * sal;
				DA = 0.9F * sal;
		}
		else
		{
				HRA = 2000;
				DA = 0.98F * sal;
		}
		
		GRS = sal + HRA + DA;
		System.out.println("Gross Salary = "+GRS);
	}
}
		
		