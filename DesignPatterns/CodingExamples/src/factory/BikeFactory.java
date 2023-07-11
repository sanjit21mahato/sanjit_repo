package factory;

public class BikeFactory {
	static Bike bike=null;
	public static Bike getInstance(String bikeType) {
		
		if("hero".equalsIgnoreCase(bikeType)){
			bike= new HeroBike();
		}else if("tvs".equalsIgnoreCase(bikeType)){
			bike = new TVSBike();
		}
		return bike;
	}
}
