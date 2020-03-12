
public class Person extends Object{
	protected String name;
	public Person(String name) {
		this.name=name;
		System.out.println("Persono maker is called");
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
}
