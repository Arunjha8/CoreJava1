package core.java.basic.constructor;

public class Employee extends Person{
	
	private String department;
	
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Employee() {
	}
	
	public Employee(int id, String name, String address, String department) {
	
		super(id, name, address);
		this.department = department;
		
}
}
