import java.io.FileInputStream;
import java.io.IOException;

public class AppStart {

	public static int method(int x, int y, int z) {
		return 0;
	}

	public static void func() throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("data.txt");
		}

		catch (IOException e) {
			System.out.println("x");
			throw e;

		} 
		finally {
			try {

				fis.close();

			} 
			catch (Exception e) {}
		}
	}

	public static void main(String[] args) throws IOException {
		func();
	}
}
