package factory;

public class HeroBike implements Bike {

	
	public HeroBike() {
		System.out.println("In Hero constructor");
	}
	
	public int getPrice() {
		return 80000;
	}
}
