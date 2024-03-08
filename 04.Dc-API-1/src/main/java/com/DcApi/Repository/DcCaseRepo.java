package com.DcApi.Repository;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;

import com.DcApi.Entity.DcCaseEntity;


public interface DcCaseRepo extends JpaRepository<DcCaseEntity, Serializable>{
	
	public DcCaseEntity findByAppId(Integer appId);

}
