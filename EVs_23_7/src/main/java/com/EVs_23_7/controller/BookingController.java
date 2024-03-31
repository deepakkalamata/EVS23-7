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

import com.EVs_23_7.entity.Booking;
import com.EVs_23_7.service.BookingService;
import com.EVs_23_7.service.LocationService;

//@RestController
@Controller
//@RequestMapping("/booking")
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private LocationService locationService;
	
	@PostMapping("/bookingslot12")
	public String bookingslot(@ModelAttribute Booking booking) {
		Booking savedBooking = bookingService.saveDetails(booking);
		//bookingService.saveDetails(booking);
		System.out.println("details are saved successfully :--> "+savedBooking);
		System.out.println("slot id -->"+savedBooking.getSlot_id());
		System.out.println("slot vehicle number -->"+savedBooking.getVehicleNumber());
        locationService.updateLocationData(savedBooking.getSlot_id(), 1, "BOOKED", savedBooking.getVehicleNumber());
		return "/bookingslot";	
	}

//	@CrossOrigin
//	@PostMapping("/saveBookings")
//	public Booking postDetails(@RequestBody Booking booking) {
//		System.out.println("post detatails method is called here ");
//		return bookingService.saveDetails(booking);
//	}
//
	@CrossOrigin
	@GetMapping("/getBookings")
	public List<Booking> getDetails() {
		System.out.println("hi get details method called here");
		return bookingService.getAllDetails();
	}

}
