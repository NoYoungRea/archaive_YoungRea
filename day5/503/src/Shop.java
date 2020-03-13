
public class Shop {
	public Beverage order(String name) {
		Beverage beverage=null;
		switch(name) {
		case "Coffee":
			beverage=new Coffee();
			break;
		case "Tea":
			beverage=new Tea();
			break;
		default:
			break;
		}
		if(beverage !=null) {
			beverage.boilWater();
			beverage.brew();
			beverage.pourInCup();
			beverage.addCondiment();
			
		}
		else {
			System.out.println(name+"x");
		}
		return beverage;
	}
}
