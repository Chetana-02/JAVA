
public class Q22 {

	public static void main(String[] args) {
		
		 int [] arr = new int [] {5,8,9,4,6,2};     
	        int temp = 0;    
	        System.out.println("Elements of original array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.println(arr[i] + " ");    
	        }    
	        
	        for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] < arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }    
	            
	        System.out.println();    
	              
	        System.out.println("Elements sorted in descending order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }    
	    }    
	   

	}


