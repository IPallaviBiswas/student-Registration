package com.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.entity.Registration;
import com.webapp.repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	//to save the data i will build one method
	public void saveRegistration(Registration registration) {//this is entity object all the data which will come from controller
     //to save the object in service layer
		
		registrationRepository.save(registration);
		//repository save entity object to db
}

	public List<Registration> getAllRegistrations() {
		List<Registration> reg = registrationRepository.findAll();
		return reg;
	}

	public void deleteRegById(long id) {
		registrationRepository.deleteById(id);
		
	}

	public Registration getRegistrationById(long id) {
		Registration reg = registrationRepository.findById(id).get();
		return reg;
	}
}
