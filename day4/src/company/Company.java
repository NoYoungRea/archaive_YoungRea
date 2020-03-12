package company;
import employees.Employee;
import employees.Regular;
import employees.PartTime;

public class Company {
	private Employee[] employees;
	private int count;
	private int capital;
	
	public Company(int employeeCount, int capital) {
		employees=new Employee[employeeCount];
		this.capital=capital;
		this.count=0;
	}
	public void setEmployees(Employee[] employees) {
		this.employees=employees;
	}
	public void setCapital(int capital) {
		this.capital=capital;
	}
	public Employee[] getEmployees() {
		return employees;
	}
	public int getCount() {
		return count;
	}
	public int getCapital()	{
		return capital;
	}
	
	public boolean hire(Employee employee) {
		if(count<employees.length) {
			employees[count++]=employee;
			System.out.println(employee.getName()+" hire");
		}
		else
			System.out.println("limited");
		return false;
	}
	
	public Employee find(String name) {
		for(Employee emp:employees) {
			if(emp.getName().equals(name)) {
				return emp;
			}
		}
		return null;
	}

	public void showInfo() {
		System.out.println("capital:"+capital);
		System.out.println("number:"+count);
	}
	public void showInfo(boolean listFlag) {
		showInfo();
		if(listFlag) {
			showList();
		}
	}
	public void showList() {
		for(Employee emp:employees) {
			if(emp instanceof Regular) {
				System.out.println("name: "+emp.getName()+"[Regular]");
				
			}
			else
				System.out.println("name: "+emp.getName()+"[PartTime]");
		}
	}
	public void pay() {
		for(int i=0;i<count;i++) {
			if(employees[i] instanceof Regular) {
				int tmp=((Regular)employees[i]).pay();
				System.out.println("give"+employees[i].getName()+" "+tmp);
				capital-=tmp;
			}
			else {
				PartTime pt=(PartTime)employees[i];
				System.out.println("give"+pt.getName()+" "+pt.pay());
				capital-=pt.pay();
			}

		}
	}
}
