
public class AppStart {
	public static void main(String[] args) {
		WeatherData wc=new WeatherData();
		Observer sd=new StaticDisplayer(wc);
		wc.addObserver(sd);
		wc.setTemp(13);
		wc.setHumi(20);
		wc.setPres(1013);
		//wc.notifyObserver();
	}
}
