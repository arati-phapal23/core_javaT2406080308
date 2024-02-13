package session_04;

public class Employee {
	
	private int empId;
	private String empName;
	private date dt_of_joining;
	public Employee(int empId, String empName, date dt_of_joining) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dt_of_joining = dt_of_joining;
	}
	
	
    public String toString () {
    	return "Employee [empId=" +empId + "," +"empName=" +empName="+empNmae +", dt_of_joining="+ dt_of_joining + "]";
    			
    }
}
