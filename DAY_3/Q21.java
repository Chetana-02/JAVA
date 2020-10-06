import java.util.Scanner;

class Q21 {
	
   public static void main(String args[]){
	   
      Scanner sc = new Scanner(System.in);
      int[] array = new int[6];
      int sum = 0;
      int avg = 0;
      System.out.println("Enter the elements:");
      for (int i=0; i<6; i++)
      {
    	  array[i] = sc.nextInt();
      }
      for( int num : array) {
          sum = sum+num;
          avg = sum/6;
      }
      System.out.println("Sum of array elements is:"+sum);
      System.out.println("avg of array elements is:"+avg);
   }
}