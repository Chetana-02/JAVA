/*35.	Create a class MathOperation that has four static methods. add() method that takes two
 integer numbers as parameter and returns the sum of the numbers. subtract() method that 
 takes two integer numbers as parameter and returns the difference of the numbers. 
 multiply() method that takes two integer numbers as parameter and returns the product. 
 power() method that takes two integer numbers as parameter and returns the power of first 
 number to second number. Create another class Demo (main class) that takes the two numbers 
 from the user and calls all four methods of MathOperation class by providing entered 
 numbers and prints the return values of every method.*/
 
 import java.util.Scanner;
 import java.lang.Math.*;
 class MathOperation{
	 
	 static int add(int i,int j){
		 return i+j;
	 }	
	 
	 static int sub(int i,int j){
		 return i-j;
 }
	static int mul(int i,int j){
		 return i*j;
	}
	
	static int power(int i,int j){
		 int result = (int)Math.pow(i, j);     //DOWNCASTING FROM DOUBLE TO INT
		 return result;
	}
 }
 
 class Demo{
	 public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter two integers");
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 
		 int ad = MathOperation.add(a,b);
		 System.out.println("Addition = "+ad);
		 
		 int s = MathOperation.sub(a,b);
		 System.out.println("Subtraction = "+s);
		 
		 int m = MathOperation.mul(a,b);
		 System.out.println("Multiplication = "+m);
		 
		 int p = MathOperation.power(a,b);
		 System.out.println("Power of first num to secount num = "+p);
	 }
 }