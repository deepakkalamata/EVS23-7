//package com.EVs_23_7.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.EVs_23_7.entity.SlotData;
//import com.EVs_23_7.service.SlotTableService;
//
//@RestController
//@RequestMapping("/location")
//public class LocationController {
//
//	@Autowired
//	private LocationService locationService;
//	
//	@CrossOrigin
//	@PostMapping("/addLocation")
//	public LocationData postDetails(@RequestBody LocationData locationData) {
//		 //slotTableService.saveDetails(slotData);
//		 System.out.println("post detatails method is called here ");	 
//		 return locationService.saveDetails(locationData);
//	}
//	
//	@CrossOrigin
//	@GetMapping("/getLocation")
//	public List<LocationData>getDetails(){
//		System.out.println("hi get details method called here");
//		return locationService.getAllDetails();
//	}
//	
//	
//}
