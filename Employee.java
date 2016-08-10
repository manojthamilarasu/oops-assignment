package mj.data;

public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	public Employee(){
		firstName=null;
		lastName=null;
		salary=0;}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		if(salary>=0)
		return salary;
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

	

		
	}

