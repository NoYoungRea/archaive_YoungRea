import java.lang.*; //�� ���� ���� �Ǿ� ����
import my.lang.*;
import my.lang.City;
import my.lang.Subject;
public class AppStart {
	public static void main(String[]args) {
		my.lang.Integer a;
		Integer b = new Integer(10);
		City c=City.BUSAN;   //�̰� �ν� �� ���� ����
		int num=Subject.KOR;

		System.out.println(c.getKm());
		System.out.println(c.compareTo(City.SEOUL));
		System.out.println(num);
	}
}
