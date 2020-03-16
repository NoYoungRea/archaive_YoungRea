import java.io.IOException;

public class AppStart {

	public static void main(String[] args) {
		try {
			System.out.print("input:");
			int n=System.in.read();
			int a=10/0;

		}
		catch(IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			System.out.println("math");
			e.printStackTrace();
		}
		finally {
			System.out.println("done");
		}
	}
}
