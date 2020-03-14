
public class AppStart {
	public static void main(String[]args) {

		Duck d1=new MalleredDuck();
		Duck d2=new RubberDuck();
		Duck d3=new Donald();
		
		d1.setFlyable(new FlyByWing());
		d2.setFlyable(new FlyNoWay());
		d3.setFlyable(new FlyNoWay());
		
		d1.fly();
		d2.fly();
		d3.fly();
		
		d3.setFlyable(new FlyByWing());
		d3.fly();
	}
}
