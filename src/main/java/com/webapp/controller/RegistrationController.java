package com.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.webapp.dto.RegistrationDto;
import com.webapp.entity.Registration;
import com.webapp.service.RegistrationService;
import com.webapp.util.EmailService;

@Controller
public class RegistrationController {
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private RegistrationService registrationService;
	
	//http://localhost:8080/view-registration-page
	//Handler Methods
	@RequestMapping("/view-registration-page")
	public String viewsRegistrationPage() {
      return "new_registration";
		}
	//ways to read the form data 1
//	@RequestMapping("/saveReg")
//	public String saveRegistration(@ModelAttribute Registration registration) {//entity class name,object(values are going to be saved in the object)
//	   
//		registrationService.saveRegistration(registration);//'registration'object will go to service layer registration--line 17
//	   return "new_registration";
//	}
	
	//ways to read the form data 2
//	@RequestMapping("/saveReg")
//	public String saveRegistration(
//			@RequestParam("firstname")String fName,
//			@RequestParam("lastname")String lName,
//			@RequestParam("email")String email,
//			@RequestParam("mobile")long mobile,
//			ModelMap model //it will acts as reuest.set/get attribute
//			) {
//			
//		
//		
//		
//	   //now put this data in entity class object
//		Registration registration = new Registration();
//		registration.setFirstname(fName);
//		registration.setFirstname(lName);
//		registration.setEmail(email);
//		registration.setMobile(mobile);
//		
//		registrationService.saveRegistration(registration);
//		model.addAttribute("msg", "Record is saved...");//acts as request.set attribute
//	   return "new_registration";
//	}
	
	//-------ways to read the form data 3
	@RequestMapping("/saveReg")
	public String saveRegistration(RegistrationDto dto,ModelMap model ){
			
		Registration registration = new Registration();
		registration.setFirstname(dto.getFirstname());
		//registration.setLastname(dto.getLastname());
		registration.setEmail(dto.getEmail());
		registration.setMobile(dto.getMobile());
		
		registrationService.saveRegistration(registration);
		emailService.sendEmail(dto.getEmail(), "Welcome", "test");
		model.addAttribute("msg", "Record is saved...");
	   return "new_registration";
	}
	@RequestMapping("/getAllReg")
	public String getAllRegistrations(Model model) {
		List<Registration> reg = registrationService.getAllRegistrations();
		model.addAttribute("registrations", reg);//link to list_registration
		return "list_registrations";//redirect
		
		}
	@RequestMapping("/delete")
	public String deleteRegById(@RequestParam("id")long id, Model model) {
		registrationService.deleteRegById(id);
		List<Registration> reg = registrationService.getAllRegistrations();
		model.addAttribute("registrations", reg);
		return "list_registrations";
	}
	@RequestMapping("/getRegistrationById")
	public String getRegistrationById(@RequestParam("id")long id, Model model) {
		Registration registration= registrationService.getRegistrationById(id);//return back registration object
	     model.addAttribute("reg", registration);
	     return "update_registration";
	}
	
	
//	@RequestMapping("/updateReg")//all the data will go to dto & in the dto you should have the id field
//	public String updateRegistration(RegistrationDto dto, ModelMap model) {
//			
//			
//		Registration registration = new Registration();
//		registration.setId(dto.getId());
//		registration.setFirstname(dto.getFirstname());
//		registration.setLastname(dto.getLastname());
//		registration.setEmail(dto.getEmail());
//		registration.setMobile(dto.getMobile());
//		registrationService.saveRegistration(registration);
//		
//		//redirect to the list_registration page
//		List<Registration> reg = registrationService.getAllRegistrations();
//		model.addAttribute("registrations", reg);
//		return "list_registrations";
//		
//	}
	
	
}




