package com.DcApi.Repository;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;

import com.DcApi.Entity.DcIncomeEntity;


public interface DcIncomeRepo extends JpaRepository<DcIncomeEntity, Serializable>{
	
	public DcIncomeEntity findByCaseNum(Long caseNum);

}
