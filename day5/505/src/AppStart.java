
public class AppStart {
	public static void main(String[] args) {
		DoubleCollection dc = new DoubleCollection();
		dc.add(234.3);
		dc.add(435.2);
		dc.add(2334.4);
		dc.add(45623.1);
		Iterator dt = dc.iterator();
		while (dt.hasNext()) {
			double value = (double) dt.next();
			System.out.println(value);
		}
	}
}
