/*36.	Create a class MathOperation containing overloaded methods ‘multiply’ to calculate
 multiplication of following arguments. 
a.	 two integers 
b.	 three floats 
c.	 all elements of array 
d.	one double and one integer*/

class MathOpeOverload{
	static void Multiply(int a , int b){
		System.out.println("Multiplication of 2 integers = " +(a*b));
	}
	
	static void Multiply(float a,float b,float c){
		System.out.println("Multiplication of 3 float values = " +(a*b*c));
	}
	
	static void Multiply(double a , int b){
		System.out.println("Multiplication of 1D and 1F = " +(a*b));
	}
	
	static void Multiply(){
		int arr[] = {2,4,8,5,9,6,3};
		int b=1;
		for(int i=0;i<arr.length;i++)
		{
		    b = b * arr[i];
		}
		
		System.out.println(b);
		}	
    }
	


class MathDemo{
	public static void main(String args[]){
		MathOpeOverload.Multiply(20,30);
		MathOpeOverload.Multiply(2.3f,3.5f,5.8f);
		MathOpeOverload.Multiply(2.23d,30);
		MathOpeOverload.Multiply();		
	}
	
}
		

