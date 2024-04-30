package abstract_;

public class Driver {

	public static void main(String[] args) {
//	Cow c1= new Cow ();
//	c1.toEat();
//	c1.toRun();
//	c1.toSleep();
//	c1.toDrink();
//   Tiger t1 = new Tiger();
//   t1.toEat();
//   t1.toDrink();
//   t1.toRun();
//   t1.toSleep();
		
		
		
		
		
		
		
		
		Cow c1 = new Cow();
		c1.setEat("grass");
		c1.setRun("at field");
		c1.setSleep("at night for 5-6 hour");
	    String eat =c1.getEat();
		String run =c1.getRun();
	    String sleep  =	c1.getSleep();
		System.out.println(eat + "\n" + run+ "\n"+ sleep);
	}

}
