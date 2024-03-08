package com.DcApi.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DcApi.Entity.PlanEntity;

public interface PlanRepo extends JpaRepository<PlanEntity, Serializable>{

}
