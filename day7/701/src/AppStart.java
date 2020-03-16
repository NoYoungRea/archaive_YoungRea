
public class AppStart {

	public static void funcA() throws Exception{
		throw new Exception("test");
	}

	public static void main(String[] args) throws Exception {
		funcA();
		System.out.println("done");
	}
}
