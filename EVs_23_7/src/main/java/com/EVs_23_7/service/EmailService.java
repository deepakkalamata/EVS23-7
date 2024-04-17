package com.EVs_23_7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.EVs_23_7.repository.BookingRepo;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Autowired
	private BookingRepo bookingRepo;
	
	public void sendMail(String mail,String userName,String station,Integer slot_id , Integer verificationCode) {
		
		System.out.println("Before Mail sending...");

		try{
			
			MimeMessage message = javaMailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message);
			
			helper.setFrom("deepakkalamata2002@gmail.com");
			helper.setTo(mail);
			helper.setSubject("Congratulations " + userName + " your slot booking is confirmed 🤩🥳🎉 ");
			helper.setText("Welcome to EV's23/7 \n\n Hello " + userName + ", your charging slot booking is successfully completed at station name : " + station + " Your slot ID is " + slot_id + ", and your verification code is " + verificationCode + ".\n\n Please use this code when entering the station. Do not share this code with anyone.\n\n Note: This booking will expire within 59 minutes.\n\n Please arrive before that time ends.\n\n Remember a fast drive could be your last drive. Drive safely! We are eagerly awaiting your arrival.\n\nHave a great journey! 😍😍😍");
			javaMailSender.send(message);
			
			System.out.println("Mail sent successfully with " + verificationCode);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
