import company.Company;
import employees.PartTime;
import employees.Employee;
import employees.Regular;
public class AppStart3 {
	private Company company;
	
	public AppStart3(int count, int capital){
		company=new Company(count,capital);
	}
	
	public void start() {
		company.hire(new Regular("a",35000000));
		company.hire(new Regular("b",35000000));
		company.hire(new PartTime("c",120,9000));
		company.hire(new PartTime("d",100,8600));
		company.showInfo();
		company.showList();
		company.pay();
		company.showInfo();
		company.showInfo(true);
		
		Employee emp=company.find("hgd");
		if(emp!=null)
			System.out.println(emp.getName()+"succeded");
		else
			System.out.println("fail");
		

	}
	
	public static void main(String[]args) {
		AppStart3 app=new AppStart3(3,10000000);
		app.start();
	}
}
