package my.lang;

public enum City {
	SEOUL(0), DAEJEON(100),KWANGJU(200),BUSAN(300),JEJU(400);
	private int km;
	
	private City(int km) {
		this.km=km;
	}
	public int getKm() {
		return km;
	}
}
