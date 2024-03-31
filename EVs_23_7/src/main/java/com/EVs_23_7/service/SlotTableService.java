package com.EVs_23_7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EVs_23_7.entity.SlotData;
import com.EVs_23_7.repository.SlotTableRepository;

@Service
public class SlotTableService {
	
	@Autowired
	private SlotTableRepository slotTableRepository;
	
	public SlotData saveDetails(SlotData slotData) {

		return slotTableRepository.save(slotData);
	}
	public List<SlotData>getAllDetails(){
		
		return slotTableRepository.findAll();
	}
}
