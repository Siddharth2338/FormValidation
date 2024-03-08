package com.DcApi.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DcApi.Entity.DcChildren;


public interface DcChildrenRepo extends JpaRepository<DcChildren, Serializable>{

	public List<DcChildren> findByCaseNum(Long caseNum);
}
