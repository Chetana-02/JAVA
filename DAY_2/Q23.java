import java.util.*; 
  
public class Q23
{ 
    public static void main(String[] args) 
    { 
        // Let us create an array of integers 
        Integer arr[] = {10, 20, 30, 40, 50}; 
  
        System.out.println("Original Array : " + Arrays.toString(arr)); 
          
		//Reversing an Array
        Collections.reverse(Arrays.asList(arr)); 
          
        System.out.println("Modified Array : " + Arrays.toString(arr)); 
    } 
} 