package com.DcApi.Entity.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.DcApi.Entity.Binding.CreateCaseResponse;
import com.DcApi.Service.DcService;

@RestController
public class CreateCaseController {
	
	@Autowired
	private DcService service;
	
	@GetMapping("/case/{appId}")
	public ResponseEntity<CreateCaseResponse> createCase(@PathVariable Integer appId){
		
		Long caseNum = service.loadCaseNumber(appId);
		Map<Integer,String> planNames = service.getPlanNames();
		
		CreateCaseResponse response = new CreateCaseResponse();
		response.setCaseNum(caseNum);
		response.setPlanNames(planNames);
		
		return new ResponseEntity<CreateCaseResponse>(response, HttpStatus.OK);
	}

}
