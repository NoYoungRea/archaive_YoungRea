class A{}
class B extends A{}
public class AppStart {
	public void a()throws NumberFormatException {
		b();
	}
	public void b()throws NumberFormatException {
		c();
	}
	public void c() throws NumberFormatException{
		String str="�����ϻ�";
		Double d=Double.parseDouble(str);
		System.out.println(d);
	}

	public static void main(String[] args) throws NumberFormatException{
		AppStart app=new AppStart();
		app.a();	
	}
}
