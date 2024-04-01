package com.EVs_23_7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EVs_23_7.entity.LocationData;
import com.EVs_23_7.entity.SlotData;
import com.EVs_23_7.service.LocationService;
import com.EVs_23_7.service.SlotTableService;

@RestController
//@Controller
@RequestMapping("/slot5")
public class SlotDataController {
	
	@Autowired
	private SlotTableService slotTableService;
	
	@Autowired
	private LocationService locationservice;
	@CrossOrigin
	@PostMapping("/addSlots")
	public SlotData postDetails(@RequestBody SlotData slotData) {
		 //slotTableService.saveDetails(slotData);
		 System.out.println("post detatails method is called here ");
		 return slotTableService.saveDetails(slotData);
	}
//	public SlotData postDetails(@RequestBody SlotData slotData) {
//		return slotTableService.saveDetails(slotData);
//	}
//	@CrossOrigin
//	@GetMapping("/gettable")
//	public List<SlotData>getDetails(){
//		System.out.println("hi get details method called here");
//		return slotTableService.getAllDetails();
//	}
	@CrossOrigin
	@GetMapping("/gettable")
	public List<LocationData>getDetails1(){
		System.out.println("hi get details method called here");
		return locationservice.getAllDetails();
	}
//	@PostMapping("/addSlots")
//	public String postDetails(@ModelAttribute SlotData slotData) {
//	    slotTableService.saveDetails(slotData);
//	    return "posted successfully";
//	}
}
