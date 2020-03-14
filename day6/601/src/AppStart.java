
public class AppStart {
	public static void main(String[]args) {

		Duck[] ds=new Duck[] {new Donald(),new RubberDuck(),new MalleredDuck()};
		for(int i=0;i<ds.length;i++) {
			ds[i].fly();
		}
	}
}
