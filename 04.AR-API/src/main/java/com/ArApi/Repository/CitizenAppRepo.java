package com.ArApi.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ArApi.Entity.CitizenAppEntity;

public interface CitizenAppRepo extends JpaRepository<CitizenAppEntity, Serializable>{

}
