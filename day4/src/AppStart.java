import java.lang.*; //�� ���� ���� �Ǿ� ����
import my.lang.City;
import my.lang.Subject;
public class AppStart {
	public static void main(String[]args) {
		my.lang.Integer a;
		
		City c=City.BUSAN;   //�̰� �ν� �� ���� ����
		int num=Subject.KOR;

		System.out.println(c.getKm());
		System.out.println(c.compareTo(City.SEOUL));
		System.out.println(num);
	}
}
