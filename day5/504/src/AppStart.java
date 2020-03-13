import java.util.Scanner;

public class AppStart {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner("a b c d e");
		while(sc.hasNext()) {
			String str=sc.next();
			System.out.println(str);
		}
		sc.close();
		
		Collection c = new Collection(100);
		c.add(10);
		c.add(20);
		c.add(30);

		Iterator it=c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		it=c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

