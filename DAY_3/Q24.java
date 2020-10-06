import java.util.*;
 
public class Q24{
	
    public static void main(String args[]) {
        int count, num, i;
        int[] inputArr = new int[500];
   
        Scanner sc = new Scanner(System.in);
   
        System.out.println("Enter number of elements");
        count = sc.nextInt();
        System.out.println("Enter " + count + " elements");
        for(i = 0; i < count; i++) {
            inputArr[i] = sc.nextInt();
        }
 
        System.out.println("Enter element to search");
        num = sc.nextInt();
      
        for (i = 0; i < count ; i++) {
            if(num == inputArr[i]){
               System.out.println(num+" is present at index "+i);
               break;
            }
        }
   
        if(i == count)
           System.out.println(num + " not present in input array");
    }
}