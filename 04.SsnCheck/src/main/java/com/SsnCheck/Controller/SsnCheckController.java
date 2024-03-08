package com.SsnCheck.Controller;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SsnCheck.Entity.SsnEntity;
import com.SsnCheck.Repository.SsnCheckRepository;

@RestController
public class SsnCheckController {
	
	@Autowired
	private SsnCheckRepository repository;
	
	@GetMapping("/ssn")
	public ResponseEntity<String> checkState(@PathVariable Long ssn){
		
		String stateSsn = "";
		
		//Optional<SsnEntity> state = repository.findById(ssn);
		BeanUtils.copyProperties(ssn, stateSsn);
		
		if(stateSsn!=null) {
			
			if(stateSsn.startsWith("1")) {
				
				return new ResponseEntity<String>("New Jersey", HttpStatus.OK);
			}if(stateSsn.startsWith("2")) {
				
				return new ResponseEntity<String>("Alska", HttpStatus.OK);
			}if(stateSsn.startsWith("3")) {
				
				return new ResponseEntity<String>("California", HttpStatus.OK);
			}if(stateSsn.startsWith("4")) {
				
				return new ResponseEntity<String>("New Maxico", HttpStatus.OK);
			}else {
				
				return new ResponseEntity<String>("Ssn Number Not Present", HttpStatus.OK);
			}
		}
		return null;		
	}

}
