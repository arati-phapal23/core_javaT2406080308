
public class Employee {
	
	private int empId;
	private String empName;
	private float empSal;
	private static int count;
	
	public Employee () {}

	
	public Employee (int empId, String empName, float empsal) {
		
		this.empId = empId;
		this.empName = empName;
		this.empSal = empsal;
		count++;
		
	}
	
	public static int getCount()
	{
		
		return count;
		
	}
	
	public String tostring () {
		return "Employee [empId=" + empId + ", "+ "empName=" + empName + ", " + "empSal=" + empSal + "]";
	}
	
	static 
	{
		System.out.println ("Static Block Called!!!");
		count = 60;
		
	}
	
	public static void main(String [] args) {
		System.out.println("Main method called!!");
	Employee e1 = new Employee(111,"Ajit",52634.56f);
	    System.out.println(e1);
	Employee e2 = new Employee(222,"Arati",63514.76f);
	    System.out.println(e2);
	Employee e3 = new Employee(333,"Anjali",67256.65f);
	    System.out.println(e3);
	    
	System.out.println("Employee Count = " +Employee.getCount());
	
		
	}
	

}
