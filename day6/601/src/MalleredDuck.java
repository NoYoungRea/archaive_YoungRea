
public class MalleredDuck extends Duck{
	public MalleredDuck() {
		super("malleredDuck");
	}
	public void fly() {
		System.out.print(name+" ");
		flyable.doFly();
	}
}
