import java.util.*;
public class Q23{
	
    public static void main(String[] args) {
    	
    int[] intArr = {33,43,53,83,63,73,93,23};
     
  
    System.out.println("Original Array:");
    for(int i=0;i<intArr.length;i++)
         System.out.print(intArr[i] + "  ");
     
    System.out.println();
  
    System.out.println("Origina Array in reverse order:");
         for(int i=intArr.length-1;i>=0;i--)
         System.out.print(intArr[i] + "  ");
    }
}