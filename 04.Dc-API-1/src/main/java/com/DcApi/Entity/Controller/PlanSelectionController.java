package com.DcApi.Entity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DcApi.Entity.Binding.PlanSelection;
import com.DcApi.Service.DcService;

@RestController
public class PlanSelectionController {

	@Autowired
	private DcService service;
	
	@PostMapping("/plansel")
	public ResponseEntity<Long> planSelection(@RequestBody PlanSelection planSel){
		
		Long caseNum = service.savePlanSelection(planSel);
		
		return new ResponseEntity<Long>(caseNum, HttpStatus.CREATED);
	}
}
