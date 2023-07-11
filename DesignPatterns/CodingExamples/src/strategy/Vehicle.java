package strategy;

public class Vehicle {
  
	DriveStrategyInterface vehicleStrategy;
	
	public Vehicle(DriveStrategyInterface vehicleStrategy) {
		this.vehicleStrategy =vehicleStrategy;
	}
	
	void drive() {
		vehicleStrategy.drive();
	}
	
	/*void drive(VehicleStrategyInterface vehicleStrategy) {
		vehicleStrategy.drive();
	}*/
}
