
public class Shop {
	public Beverage order(String name,boolean addCondiment) {
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

			beverage.Creat(addCondiment);
		}
		else {
			System.out.println(name+"x");
		}
		return beverage;
	}
}
