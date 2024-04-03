package assessment1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	 public static void main(String[] args) {
	       List<Vehicle> vehicles = new ArrayList<>();
	       vehicles.add(new Vehicle("1", "Bike", true, 7));
	       vehicles.add(new Vehicle("2", "Car", true, 5));
	       vehicles.add(new Vehicle("3", "Van", true, 3));
	       vehicles.add(new Vehicle("4", "Bus", true, 1));
	       VehicleRentalSystem rentalSystem = new VehicleRentalSystem(vehicles);
	       RentalRequest request = new RentalRequest("Car", 3);
	       try { rentalSystem.processRentalRequest(request); }
	       catch (VehicleUnavailableException | InvalidRentalPeriodException e) { System.out.println("Exception: " + e.getMessage()); }
	   }
	}

