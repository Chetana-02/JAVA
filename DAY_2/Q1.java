import java.util.Scanner;
class Q1{
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
	int a = sc.nextInt();
	System.out.println("Entered number is = "+a);
	for(int i=0 ; i<=10 ; i++ )
    System.out.printf("%d * %d = %d \n", a, i, a * i);

	}
}