class Q3{
	public static void main(String args[]){
		int x = 4;
		int z;
		boolean x1=true;
		boolean y1=false;
		boolean z1;
			
		//Condition 1
	    int y = x*x + 3*x - 7;
		System.out.println("y = "+y);
		
		//Condition 2
		y = x++ + ++x;
		System.out.println("y = "+y+ "\nx ="+x);

		//Condition 3
		z = x++ - --y - --x  +  x++;
		System.out.println("y = "+x+ "\nx = "+y+ "\nz = "+z);
		
		//Condition 4
		
		z1 = x1 && y1 || !(x1 || y1);
		System.out.println("z = "+z1);

		
	}
}
		