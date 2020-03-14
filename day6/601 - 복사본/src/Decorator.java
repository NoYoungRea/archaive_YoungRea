
public abstract class Decorator extends Beverage{
	protected Beverage beverage;
	
	public Decorator(Beverage beverage, String name, int cost) {
		super(name,cost);
		this.beverage=beverage;
	}
	public String getName() {
		
		return beverage.getName()+", "+name;
	}
	public int getCost() {
		return beverage.getCost()+cost;
	}
}
