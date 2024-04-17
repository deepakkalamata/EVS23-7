package com.EVs_23_7.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.EVs_23_7.entity.Booking;
import com.EVs_23_7.repository.BookingRepo;

@Service
public class BookingService {

	@Autowired
	private BookingRepo bookingRepo;
	
	public Booking saveDetails(Booking booking) {

		return bookingRepo.save(booking);
	}
	public List<Booking>getAllDetails(){
		
		return bookingRepo.findAll();
	}
//	public boolean existsByOtp(Integer otp) {
//		// TODO Auto-generated method stub
//		 return bookingRepo.existsByOtp(otp);
//	}
}
