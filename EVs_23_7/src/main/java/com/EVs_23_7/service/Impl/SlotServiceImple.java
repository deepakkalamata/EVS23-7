package com.EVs_23_7.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EVs_23_7.entity.Slot;
import com.EVs_23_7.repository.SlotRepo;
import com.EVs_23_7.service.SlotService;

@Service
public class SlotServiceImple implements SlotService {

	@Autowired
	SlotRepo slotRepo;
	
	
	@Override
	public Slot saveSlotData(Slot slot) {
		// TODO Auto-generated method stub
		return slotRepo.save(slot);
	}

	
	
}
