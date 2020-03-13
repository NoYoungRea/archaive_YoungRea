
public class AppStart {
	public static void main(String[] args) {
		Runable d=new Duck();
		
		if(d instanceof Flyable)
			((Flyable)d).fly();
	}
}
