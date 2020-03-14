
public class RubberDuck extends Duck {
	
	public RubberDuck() {
		super("rubberDuck");
	}
	public void fly() {
		System.out.print(name+" ");
		flyable.doFly();
	}
}
