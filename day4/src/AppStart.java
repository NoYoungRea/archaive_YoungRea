import java.lang.*; //이 것이 생략 되어 있음
import my.lang.City;
import my.lang.Subject;
public class AppStart {
	public static void main(String[]args) {
		my.lang.Integer a;
		
		City c=City.BUSAN;   //이게 훨신 더 직관 적임
		int num=Subject.KOR;

		System.out.println(c.getKm());
		System.out.println(c.compareTo(City.SEOUL));
		System.out.println(num);
	}
}
