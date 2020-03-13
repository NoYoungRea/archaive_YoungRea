 class Fightable{
	public  void fight() {
		
	};
}
public class AppStart {
	public static void main(String[] args) {
		Fightable fighter=new Fightable() {
			public void fight() {
				System.out.println("x");
			}
		};
		fighter.fight();
	}
}
