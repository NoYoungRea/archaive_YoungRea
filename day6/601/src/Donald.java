
public class Donald extends Duck {
	
	public Donald() {
		super("donald");
	}
	public void fly() {
		System.out.print(name+" ");
		flyable.doFly();
	}
}
