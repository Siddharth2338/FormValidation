package com.DcApi.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="DC_CHILD")
@Data
public class DcChildren {

	@Id
	@GeneratedValue
	private Integer childId;
	private LocalDate dob;
	private Long childSsn;
	private Long caseNum;
}
