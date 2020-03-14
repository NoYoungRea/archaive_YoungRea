
public abstract class Decorator extends Beverage {
	protected Beverage beverage;

	public Decorator(Beverage beverage, String name, int cost) {
		super(name, cost);
		this.beverage = beverage;
	}

	public String getName() {
		if (beverage != null) {
			return beverage.getName() + "," + name;
		}

		return name;
	}

	public int getCost() {

		if (beverage != null) {

			return beverage.getCost() + cost;
		}
		return cost;
	}
}
