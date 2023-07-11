package factory;

public class FactoryClient {

	public static void main(String[] args) {

     Bike bike = BikeFactory.getInstance("hero");
     System.out.println(bike.getPrice());

	}

}
