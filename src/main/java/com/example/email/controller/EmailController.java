package com.example.email.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.email.dto.Email;
import com.example.email.service.EmailService;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;

	@GetMapping(value = "/sendmail")
	public String sendmail() {
		Email mail = new Email();
		mail.setTo("tomail@gmail.com");
		mail.setSubject("Test Subject");
		mail.setContent("Test mail");
		mail.setFrom("no-reply@tenet.com");		
		emailService.sendMail(mail);
		return "emailsent";
	}
	
	@GetMapping(value = "/sendmailwithattachment")
	public String sendEmailWithAttachment() {
		Email mail = new Email();
		mail.setTo("tomail@gmail.com");
		mail.setSubject("Test Subject");
		mail.setContent("Test mail");
		mail.setFrom("no-reply@tenet.com");		
		emailService.sendEmailWithAttachment(mail);
		return "sendEmailWithAttachment";
	}
	
	@GetMapping(value = "/sendmailwithtemplate")
	public String sendEmailWithTemplate() {
		Email mail = new Email();
		mail.setTo("tomail@gmail.com");
		mail.setSubject("Test Subject form template");
		mail.setContent("Test mail contenct");
		mail.setFrom("no-reply@tenet.com");		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("name", "Do Chen");
		mail.setModel(model);
		emailService.sendEmailWithTemplate(mail);
		return "sendEmailWithTemplate";
	}
}
