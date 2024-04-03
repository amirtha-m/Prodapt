package assessment1;

import java.util.List;
import java.util.ArrayList;

public class VehicleRentalSystem {
	List<Vehicle> vehicles;

	public VehicleRentalSystem(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public void processRentalRequest(RentalRequest rentalRequest)
			throws VehicleUnavailableException, InvalidRentalPeriodException {
		
		if (rentalRequest.rentalPeriod < 1)
			throw new InvalidRentalPeriodException("Invalid rental period.");
		
		for (Vehicle vehicle : vehicles) {
			
			if (vehicle.type.equals(rentalRequest.vehicleType) && vehicle.available
					&& vehicle.availableDays >= rentalRequest.rentalPeriod) {
				vehicle.available = false;
				
				vehicle.availableDays -= rentalRequest.rentalPeriod;
				
				double totalCharge = rentalRequest.rentalPeriod * 40.0; // Cost of $40 per day
				System.out.println("Rental Confirmation:\n- Vehicle ID: " + vehicle.id + "\n- Rental Period: "
						+ rentalRequest.rentalPeriod + " days\n- Total Rental Charge: $" + totalCharge);
				return;
			}
		}
		
		throw new VehicleUnavailableException(
				"Requested vehicle type \"" + rentalRequest.vehicleType + "\" is unavailable.");
	}
}