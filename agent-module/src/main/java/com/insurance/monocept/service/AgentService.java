package com.insurance.monocept.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.insurance.monocept.dto.AgentDto;
import com.insurance.monocept.dto.CustomerDto;
import com.insurance.monocept.dto.InsuranceDto;
import com.insurance.monocept.dto.UserDetailsDto;

public interface AgentService {

	ResponseEntity<?> addCustomer(AgentDto agentDto);
	
	ResponseEntity<?> getUserDetails(String email);

	ResponseEntity<?> getAllAddedUser(Integer pageNo);

	ResponseEntity<?> updateCustomer(CustomerDto customerDto);

	ResponseEntity<?> addInsurance(InsuranceDto insuranceDto);

	ResponseEntity<?> uploadDocuments(MultipartFile panCard, MultipartFile adhaarFront, MultipartFile adhaarBack, long insuranceId);

	ResponseEntity<?> addUserDetails(UserDetailsDto userDetailsDto);
	
	ResponseEntity<?> getAllInsuranceScheme();

	ResponseEntity<?> getInsuranceByUser(Long userId);

	ResponseEntity<?> getInsuranceByUser(String email);

	ResponseEntity<?> sendMail(String email, String subject, String desription);

	
	

}
