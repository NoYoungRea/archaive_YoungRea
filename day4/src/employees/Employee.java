package employees;

public class Employee {
	protected String name;
	
	public Employee(String name) {
		this.name=name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
}
