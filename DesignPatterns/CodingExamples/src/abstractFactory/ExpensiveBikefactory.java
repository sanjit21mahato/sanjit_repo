package abstractFactory;

public class ExpensiveBikefactory implements BikeFactory{

	static Bike bike;

	public Bike getInstance(String type){
		if("harley".equalsIgnoreCase(type)){
			bike = new Harley();
		}else if("royal".equalsIgnoreCase(type)){
			bike = new RoyalBike();
		}
		return bike;
	}
}
