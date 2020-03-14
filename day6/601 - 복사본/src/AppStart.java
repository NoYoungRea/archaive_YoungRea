
public class AppStart {
	public static void main(String[] args) {
		Beverage a=new Coffee();
		a=new Sugar(a);
		a=new Sugar(a);
		
		Beverage b=new Lemon(null);
		b=new Lemon(b);
		
		Beverage d=new Coffee();
		d=new Lemon(d);
		
		Beverage c=new Lemon(new Coffee());
		
		
		
		
		System.out.println(a.getName()+":"+a.getCost()+"won");
		System.out.println(b.getName()+":"+b.getCost()+"won");

	}
}
