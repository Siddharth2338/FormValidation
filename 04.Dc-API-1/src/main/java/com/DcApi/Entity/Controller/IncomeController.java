package com.DcApi.Entity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DcApi.Entity.Binding.Income;
import com.DcApi.Service.DcService;

@RestController
public class IncomeController {

	@Autowired
	private DcService service;
	
	@PostMapping("/income")
	public ResponseEntity<Long> saveIncome(@RequestBody Income income){
		
		Long incomeData = service.saveIncomeData(income);
		return new ResponseEntity<Long>(incomeData, HttpStatus.OK);
	}
}

