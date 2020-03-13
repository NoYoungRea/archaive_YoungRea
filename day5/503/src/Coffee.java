
public class Coffee extends Beverage{
	
	private String subName="espreso";
	
	
	private static String productName="coffe";
	private static int productPrice=1500;
	public static void setName(String productName) {
		Coffee.productName=productName;
	}
	public static void setProductPrice(int productPrice) {
		Coffee.productPrice=productPrice;
	}
	public Coffee()
	{
		super(productName,productPrice);
	}
	public void brew() {
		System.out.println(name+"brew");
	}
	public void addCondiment() {
		System.out.println(name+"add sugar");
	}
	public void func() {
		
	}
	
}
