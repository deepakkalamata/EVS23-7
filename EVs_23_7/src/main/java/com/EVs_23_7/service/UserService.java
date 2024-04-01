package com.EVs_23_7.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EVs_23_7.entity.LocationData;
import com.EVs_23_7.entity.UserData;
import com.EVs_23_7.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public void updateUserData(String email, Integer slot_Id, Integer otp){
		
		Optional<UserData> locationDataOptional = userRepo.findById(email);
		
		locationDataOptional.ifPresent(userData -> {
			// Update the fields
			if (slot_Id != null) {
				userData.setSlot_id(slot_Id);
			}
			if (otp != null) {
				userData.setOtp(otp);
			}
			// Save the updated location data
			userRepo.save(userData);
			System.out.println(" user table is update with in this user mail "+ email);
		});
		
	}
	
	
}
