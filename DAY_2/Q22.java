import java.util.Arrays;   
import java.util.Collections;   
public class Q22{   
public static void main(String[] args){  
 
Integer [] array = {4,8,9,3,6,7};   

// sorts array[] in descending order   
Arrays.sort(array, Collections.reverseOrder());   
System.out.println("Array elements in descending order: " +Arrays.toString(array));   
        }   
	}  