import duck.Duck;
import duck.MalleredDuck;
import duck.RubberDuck;
public class AppStart {
	public static void main(String[]args) {
		Duck d=new MalleredDuck();
		d.fly();
		
		Duck r=new RubberDuck();
		r.fly();
		
	}

}
