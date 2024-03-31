package com.EVs_23_7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EVs_23_7.entity.Slot;
import com.EVs_23_7.service.SlotService;

@RestController
@RequestMapping("/slot")
public class SlotController1 {

	@Autowired
	SlotService slotService;
	
	
	@GetMapping("/fetchdata")
    public String getDataduplicate() {
        // This is a simplified example. You would typically fetch the data from a database or other source.
        return "{\"name\": \"John\", \"age\": 30}";
    }
	
	@GetMapping("/api/data")
    public String getData() {
        // This is a simplified example. You would typically fetch the data from a database or other source.
        return "{\"name\": \"John\", \"age\": 30}";
    }
	
	
	@GetMapping("/slot111")
	public String index() {
		return "hello";
	}
	@PostMapping("/saveslot")
	public Slot saveSlot(@RequestBody Slot slot) {
		
		
		return slotService.saveSlotData(slot);
	}
	
}
