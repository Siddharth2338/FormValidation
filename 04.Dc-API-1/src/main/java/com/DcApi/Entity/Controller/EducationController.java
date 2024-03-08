package com.DcApi.Entity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DcApi.Entity.Binding.Education;
import com.DcApi.Service.DcService;

@RestController
public class EducationController {

	@Autowired
	private DcService service;
	
	@PostMapping("/edu")
	public ResponseEntity<Long> saveEducation(@RequestBody Education edu){
		
		Long educationData = service.saveEducationData(edu);
		return new ResponseEntity<Long>(educationData, HttpStatus.CREATED);
	}
}
