/*32) Modify the above program (no. 31) to count the no of Student objects created. 
[ In this program static variable is required ]*/

class Student1{
	int rno;
	String name;
	
	static int count=0;
	
	void setData(int r , String n){
		rno =  r;
		name = n;
	}
	
	void showData(){
		System.out.println("Student rno = "+rno +"\n"+ "Student name = "+name);
		count++; 
		System.out.println("no of student object ="+count);
	}
}

class StudentDemo1{
	public static void main(String args[]){
	Student1 s1 = new Student1();
	s1.setData(29,"Chetana");
	s1.showData();
	s1.setData(19,"Ankita");
	s1.showData();
	}
}
	