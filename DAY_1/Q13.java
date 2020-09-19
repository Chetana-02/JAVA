class Q13{
  public static void main(String[] args) {

      int num1 = 100, num2 = 500, num3 = 900,temp,result;

		//Using if-else
			
      if( num1 >= num2 && num1 >= num3)
          System.out.println(num1+" is the largest Number");

      else if (num2 >= num1 && num2 >= num3)
          System.out.println(num2+" is the largest Number");

      else
          System.out.println(num3+" is the largest Number");
	  
	   //Using Ternary Operator 
	   
	    temp = num1>num2 ? num1:num2;
        result = num3>temp ? num3:temp;
        System.out.println("Largest Number is:"+result);
  }
}
