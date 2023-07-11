package abstractFactory;

public class OrdinaryBikeFactory implements BikeFactory {
	static Bike bike;

	public Bike getInstance(String type){
		if("hero".equalsIgnoreCase(type)){
			bike = new HeroBike();
		}else if("tvs".equalsIgnoreCase(type)){
			bike = new TVSBike();
		}
		return bike;
	}
}
