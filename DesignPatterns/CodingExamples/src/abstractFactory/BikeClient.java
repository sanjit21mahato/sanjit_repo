package abstractFactory;

public class BikeClient {

	public static void main(String[] args) {
		
		BikeFactory factory = Factory.getBikeFactory("expensive");
		Bike bike =factory.getInstance("royal");
		System.out.println(bike.getPrice());

	}

}
