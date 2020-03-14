
public abstract class Duck {
	
	protected Flyable flyable;
	protected String name;
	public Duck(String name) {
		this.name=name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setFlyable(Flyable flyable) {
		this.flyable=flyable;
	}
	public String getName() {
		return name;
	}
	public abstract void fly();
}
