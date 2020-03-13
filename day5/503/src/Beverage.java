
public abstract class Beverage {
	protected String name;
	protected int price;
	
	public Beverage(String name,int price) {
		this.name=name;
		this.price=price;
	}
	public void setNAme(String name) {
		this.name=name;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public String getName() {return name;}
	public int getPrice() {return price;}
	public void boilWater() {
		System.out.println(name+"boil");
	}
	public void pourInCup() {
		System.out.println(name+"pour");
	}
	public abstract void brew();
	public abstract void addCondiment();
}
