class Q27{
	
	public static void main(String args[]){
		int number[] = {5,8,2,4,1,9};
		int biggest = number[0];
		int smallest = number[0];
		
		for(int i=0; i<number.length; i++)
		{
			if(number[i] > biggest)
				biggest = number[i];
			else if(number[i] < smallest)
				smallest = number[i];
		}
		System.out.println("biggest element =" + biggest);
		System.out.println("smallest element =" + smallest);
	}
}