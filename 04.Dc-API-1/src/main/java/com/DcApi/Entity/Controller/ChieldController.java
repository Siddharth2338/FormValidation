package com.DcApi.Entity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DcApi.Entity.Binding.Child;
import com.DcApi.Entity.Binding.ChildRequest;
import com.DcApi.Entity.Binding.DcSummary;
import com.DcApi.Service.DcService;

@RestController
public class ChieldController {

	@Autowired
	private DcService service;
	@PostMapping("/childrens")
	public ResponseEntity<DcSummary> saveChilds(@RequestBody ChildRequest request){
		
		Long caseNum = service.saveChildrens(request);
		DcSummary summary = service.getDcSummary(caseNum);
		
		return new ResponseEntity<DcSummary>(summary, HttpStatus.CREATED);
	}
}
