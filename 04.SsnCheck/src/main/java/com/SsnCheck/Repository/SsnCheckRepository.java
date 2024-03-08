package com.SsnCheck.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SsnCheck.Entity.SsnEntity;

public interface SsnCheckRepository extends JpaRepository<SsnEntity, Serializable>{

}
