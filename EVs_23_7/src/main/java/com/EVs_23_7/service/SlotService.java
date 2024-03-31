package com.EVs_23_7.service;

import org.springframework.stereotype.Service;

import com.EVs_23_7.entity.Slot;

@Service
public interface SlotService {

	public Slot saveSlotData(Slot slot);

}
