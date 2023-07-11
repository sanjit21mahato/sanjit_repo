package factory;

public class TVSBike implements Bike{
	
	public TVSBike() {
		System.out.println("In TVS constructor");
	}
	
	
	public int getPrice() {
		return 70000;
	}

}
