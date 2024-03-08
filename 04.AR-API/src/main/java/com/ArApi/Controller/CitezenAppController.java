package com.ArApi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ArApi.Binding.CitizenApp;
import com.ArApi.Service.ArService;

@RestController
public class CitezenAppController {
	
	@Autowired
	private ArService service;
	
	@PostMapping("/app")
	public ResponseEntity<String> createApp(CitizenApp app){
		
		Integer appId = service.createCitizenApp(app);
		
		if(appId > 0) {
			
			return new ResponseEntity<>("App Created with appId:"+ appId,HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Invalid SSN:",HttpStatus.BAD_REQUEST);
		}
	}

}
