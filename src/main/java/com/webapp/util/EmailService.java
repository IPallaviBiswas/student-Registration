package com.webapp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailService {
   //for set button
	//create an interface
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	
	
	public void sendEmail(String to, String subject, String message) {
		SimpleMailMessage sms = new SimpleMailMessage();//built in method
		sms.setTo(to);//this is like entry the email address in the 'to field of the gmail UI'
		sms.setSubject(subject);
		sms.setText(message);
		javaMailSender.send(sms);
	}
}
