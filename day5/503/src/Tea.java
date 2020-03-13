
public class Tea extends Beverage {
	private static String productName="Tea";
	private static int productPrice=1000;
	
	public static void setProductName(String productName) {
		Tea.productName=productName;
	}
	public static void setProductPrice(int productPrice) {
		Tea.productPrice=productPrice;
	}
	public Tea() {
		super(productName,productPrice);
		
	}
	
	
	public void brew() {
		System.out.println(name+"brew");
	}
	public void addCondiment() {
		System.out.println(name+"add lemon");
	}
}
