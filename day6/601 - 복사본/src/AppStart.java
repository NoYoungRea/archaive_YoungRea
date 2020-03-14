
public class AppStart {
	public static void main(String[] args) {
		Beverage b=new Coffee();
		b=new Sugar(b);
		b=new Sugar(b);
		System.out.println(b.getName()+":"+b.getCost()+"won");
	}
}
