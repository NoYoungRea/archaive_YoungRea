import java.io.FileInputStream;
import java.io.IOException;

public class AppStart {

	public static void func() throws Exception{
		FileInputStream fis=new FileInputStream("data.txt");
	}
	public static void read()	{
		try {
			func();
		}
		catch(IOException e) {
			System.out.println("file fail");
		}
		catch (Exception e) {
			System.out.println("x");
		}
	}
	public static void main(String[] args) {
		read();
	}
}
