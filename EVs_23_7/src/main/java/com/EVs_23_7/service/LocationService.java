package com.EVs_23_7.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EVs_23_7.entity.LocationData;
import com.EVs_23_7.repository.LocationRepo;
@Service
public class LocationService {
	@Autowired
	private LocationRepo locationRepo;

	public void updateLocationData(Integer slotId, Integer status, String bookingStatus, String vehicleNumber) {
		// Find the location data by slot ID
		Optional<LocationData> locationDataOptional = locationRepo.findById(slotId);
		// Check if location data exists
		locationDataOptional.ifPresent(locationData -> {
			// Update the fields
			if (status != null) {
				locationData.setStatus(status);
			}
			if (bookingStatus != null) {
				locationData.setBooking_status(bookingStatus);
			}
			if (vehicleNumber != null) {
				locationData.setVehicle_number(vehicleNumber);
			}
			// Save the updated location data
			locationRepo.save(locationData);
			System.out.println(" location table is update with this data "+ slotId);
		});
	}

}
