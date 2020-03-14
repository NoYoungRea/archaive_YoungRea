
public class Sugar extends Decorator{
	public static final String PDNAME="sugar";
	public static final int PDCOST=200;
	
	public Sugar(Beverage beverage) {
		super(beverage, PDNAME,PDCOST);
	}
}
