package employees;

public class Regular extends Employee {
	private int totalPay;
	public Regular(String name,int totalPay) {
		super(name);
		this.totalPay=totalPay;
	}
	public void setTotalPay(int totalPay) {
		this.totalPay=totalPay;
	}
	public int getTotalPay() {
		return this.totalPay;
	}
	public int pay() {
		return (totalPay/12);
	}
}
