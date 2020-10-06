
class Q25 { 
	
    public static void main(String args[]) {
    	
        int arr[] = {7,8,4,6,3,5,2}; 
        int even = 0, odd = 0; 
 
        for (int i = 0; i < arr.length; i++) { 
            if (i % 2 == 0) 
                even += arr[i]; 
            else
                odd += arr[i]; 
        } 
  
        System.out.println("Even index positions sum: " + even); 
        System.out.println("Odd index positions sum: " + odd); 
    } 
} 