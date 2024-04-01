package com.EVs_23_7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EVs_23_7.entity.PowerConsumptionData;
import com.EVs_23_7.repository.PowerConsumptionRepo;

@Service
public class PowerConsumptionService {
	
	@Autowired
	private PowerConsumptionRepo powerConsumptionRepo;
	
	public PowerConsumptionData saveDetails(PowerConsumptionData powerConsumptionData) {

		return powerConsumptionRepo.save(powerConsumptionData);
	}
	public List<PowerConsumptionData>getAllDetails(){
		
		return powerConsumptionRepo.findAll();
	}
	
	
}
