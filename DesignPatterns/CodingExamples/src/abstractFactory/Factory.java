package abstractFactory;

public class Factory {
	
	static BikeFactory bikeFactory;
	
	public static BikeFactory getBikeFactory(String inputType){
		if("ordinary".equalsIgnoreCase(inputType)){
			bikeFactory = new OrdinaryBikeFactory();
		}
		else if("expensive".equalsIgnoreCase(inputType)){
			bikeFactory = new ExpensiveBikefactory();
		}
		return bikeFactory;
	}

}
