
public class Employee {
	
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee ()
	{
	System.out.println("Default Constructor Called");
				empId = 111;
		        empName = "Ajit";
		        empSalary = 250000.76d;
	}
	
	public Employee(int i, String n, double d)
	{
System.out.println("Parameterized Constructor Called");
         empId = i;
         empName = n;
         empSalary = d;
         

	}
	
	public String toString()
	//String representation of an Object - Object class
	{
		return "Employee = "+empId+" "+empName+" "+" "+empSalary;
	}
	
	public static void main (String[] args) {
		Employee e = new Employee();
		System.out.println(e);
		Employee el = new Employee(222, "Arati",542667.65d);
		System.out.println(el);
		
	}
	
	

}
