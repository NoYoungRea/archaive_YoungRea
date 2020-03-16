class A{}
class B extends A{}
public class AppStart {
	public void a() {
		b();
	}
	public void b() {
		c();
	}
	public void c() {
		String str="ªÔ¡°¿œªÁ";
		Double d=Double.parseDouble(str);
		System.out.println(d);
	}

	public static void main(String[] args) {
		AppStart app=new AppStart();
		app.a();	
	}
}
