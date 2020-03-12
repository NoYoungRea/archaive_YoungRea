
public class Student extends Person{
	private String major;
	
	public Student(String name, String major) {
		super(name);
		this.major=major;
	}
	
	public void setMajor(String major) {
		this.major=major;
	}
	public String getMajor() {
		return major;
	}
	public String toString() {
		return (super.toString()+"major :"+major);
	}

}
