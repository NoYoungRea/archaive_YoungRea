
public class WeatherData extends Subject{
	private Observer[] observer;
	private int count;
	private int temp;
	private int humi;
	private int pres;
	
	public WeatherData() {
		observer=new Observer[10];
	}
	public void addObserver(Observer o) {
		o.setWeatherData(this);
		if(count<observer.length) {
			observer[count++]=o;
		}
	}
	public void notifyObserver() {
		for(int i=0; i<count;i++) {
			observer[i].update();
		}
	}
	
	//setter getter
	public void setTemp(int temp) {
		this.temp=temp;
		notifyObserver();
	}
	public void setHumi(int humi) {
		this.humi=humi;
		notifyObserver();
	}
	public void setPres(int pres) {
		this.pres=pres;
		notifyObserver();
	}
	public int getTemp() {
		return temp;
	}
	public int getHumi() {
		return humi;
	}
	public int getPres() {
		return pres;
	}
}
