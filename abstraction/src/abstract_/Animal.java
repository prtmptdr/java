package abstract_;

public abstract class Animal {
//	public abstract  void toEat();
//	public abstract  void toSleep();
//	public abstract  void toRun();
//	public void toDrink() {
//		System.out.println("Drinking water around 20 Ltr");
//	}
	 
	private String eat;
	private String sleep;
	public String getEat() {
		return eat;
	}
	public void setEat(String eat) {
		this.eat = eat;
	}
	public String getSleep() {
		return sleep;
	}
	public void setSleep(String sleep) {
		this.sleep = sleep;
	}
	
}
