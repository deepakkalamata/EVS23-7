package com.EVs_23_7.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class slotController {

	@GetMapping("/new")
	public String first() {
		System.out.println("inside first handler");
		return "new";
		// first.html page called here; 
	}
	
	@GetMapping("/dynamic_slot_display")
	public String dynamicSlotGenration(Model model) {
		
		model.addAttribute("name", "Deepak");
		model.addAttribute("currentDate",new Date().toLocaleString());
		
		System.out.println("inside first handler");
		return "dynamic_slot_display";
		// first.html page called here; 
	}
	
	@GetMapping("/form1")
	public String form1Mapping() {
		System.out.println("inside form1 handler");
		return "form1";
		// first.html page called here; 
	}
	@GetMapping("/station1")
	public String station1Mapping() {
		System.out.println("inside form1 handler");
		return "station1";
		// first.html page called here; 
	}
	@GetMapping("/dynamicSlot")
	public String station1Mapping1() {
		System.out.println("inside form1 handler");
		return "dynamicSlot";
		// first.html page called here; 
	}
	
	@GetMapping("/Second duplicate")
	public String station1Mapping2() {
		System.out.println("inside form1 handler");
		return "Second duplicate";
		// first.html page called here; 
	}
	
	@GetMapping("/bookingslot")
	public String station1Mapping3() {
		System.out.println("inside form1 handler");
		return "bookingslot";
		// first.html page called here; 
	}
	
	@GetMapping("/home")
	public String station1Mapping4() {
		System.out.println("inside form1 handler");
		return "home";
		// first.html page called here; 
	}
}
