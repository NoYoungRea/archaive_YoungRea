import java.io.IOException;

public class AppStart {

	public static void main(String[] args) {
		int n=0;
		try {
			System.out.print("input:");
			n=System.in.read();
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
		catch (Exception e) {
			//all of them is cetched by here
			//except IOE and Arith
		}
		finally {
			System.out.println(n);
		}
	}
}
