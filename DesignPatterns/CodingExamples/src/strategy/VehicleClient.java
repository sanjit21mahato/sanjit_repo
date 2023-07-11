package strategy;

public class VehicleClient {

	//private static VehicleStrategyInterface vehicleStrategy;

	public static void main(String[] args) {
		// vehicleStrategy = new NormalDriveStrategy();
		/*Vehicle vehicle = new Vehicle(VehicleStrategyInterface normalVehicleStrategy);
		vehicle.drive(normalVehicleStrategy);*/
		Vehicle vehicle = new NormalVehicle();
		vehicle.drive();
	}

}
