public class Q26
{
   public static void main(String[] args)
   {
    
      int[][] values =
      { 
     {1,2,6,4}, {7,5,1,8}, {2,8,5,9}, {2,4,6,7}, {6,0,1,3} 
      };
         int sum =0;
     
      for (int row = 0; row < 5; row++)
      {
         for (int col = 0; col < 4; col++)
         {
            System.out.print(values[row][col] + " ");

            sum = sum + values[row][col];
         }

         System.out.println();  
      }
               System.out.print("array sum = "+sum);

   }
}
