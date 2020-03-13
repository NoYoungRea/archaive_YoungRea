
public class AppStart {
	public static void main(String[]args) {
		IntegerCollection ic=new IntegerCollection(100);
		ic.add(234);
		ic.add(435);
		ic.add(2334);
		ic.add(45623);
		Iterator it=ic.iterator();
		while(it.hasNext()) {
			int value=(int)it.next();
			System.out.println(value);
		}
	}
}
