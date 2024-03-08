package com.SsnCheck.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class SsnEntity {
	
	@Id
	private Long ssn;

}
