
public class Person extends Object{
	protected String name;
	public Person(String name) {
		this.name=name;
	}

	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return ("name:"+"name");
	}
	protected void Show() {}
}
