/*33.	Write a program to demonstrate functionalities of this keyword in java. */

class Employee{
	private int empId;
	private String empName;
	
	void setData(int empId , String empName)
	{
		this.empId= empId;
		this.empName = empName;
	}
	
	void getData(){
		System.out.println("Emp_ID = "+empId +"\n"+ "empName = "+empName);
	}
}
	
class EmployeeDemo{
	public static void main(String args[]){
	Employee e = new Employee();
	e.setData(29,"Chetana");
	e.getData();
	}
  }



