package com.DcApi.Repository;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;

import com.DcApi.Entity.DcEducation;
import com.DcApi.Entity.DcIncomeEntity;


public interface DcEducationRepo extends JpaRepository<DcEducation , Serializable>{
	
	public DcEducation findByCaseNum(Long caseNum);

}
