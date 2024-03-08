package com.DcApi.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DcApi.Entity.CitizenAppEntity;

public interface CitizenAppRepo extends JpaRepository<CitizenAppEntity, Serializable>{

}
