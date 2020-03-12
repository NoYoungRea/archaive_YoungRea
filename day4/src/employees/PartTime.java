package employees;

public class PartTime extends Employee{
	private int payPerTime;
	private int workTime;
	
	public PartTime(String name,int payperTime,int workTime) {
		super(name);
		this.payPerTime=payPerTime;
		this.workTime=workTime;
	}
	public void setPayPerTime(int payPerTime) {
		this.payPerTime=payPerTime;
	}
	public void setWorkTime(int WorkTime) {
		this.workTime=WorkTime;
	}
	public int getPayPerTime() {
		return this.payPerTime;
	}
	public int getWorkTime() {
		return this.workTime;
	}
	public int pay() {
		return (payPerTime*workTime);
	}
}
