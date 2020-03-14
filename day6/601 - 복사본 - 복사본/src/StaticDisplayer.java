
public class StaticDisplayer extends Observer {

	WeatherData wd;
	
	public void setWeatherData(WeatherData wd) {
	
		this.wd=wd;
	}
	
	public void update() {
		int temp=wd.getTemp();
		int humi=wd.getHumi();
		int pres=wd.getPres();
		//this is pool
		
		System.out.println("-----------------");
		System.out.println("temp:"+temp);
		System.out.println("humi:"+humi);
		System.out.println("pres:"+pres);
		System.out.println("-----------------");
	}
	
}
