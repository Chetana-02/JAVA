import java.util.Scanner;
class Q21{
	public static void main(String args[]){
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0;i<arr.length;i++){
		System.out.println("Enter elements in an array ");
		arr[i] = sc.nextInt();
		sum = sum + arr[i];
		}
		
		for(int i=0;i<arr.length;i++){
		System.out.println("array elements = "+arr[i]);
		}
		
		System.out.println("Sum of array = "+sum);
	    avg = (float)sum/10;
		System.out.println("Average of array = "+avg);
	}
}
		