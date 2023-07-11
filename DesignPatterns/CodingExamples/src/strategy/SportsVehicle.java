package strategy;

public class SportsVehicle extends Vehicle {

	public SportsVehicle() {
		super(new SpecialDriveStrategy());
	}
}
