package com.DcApi.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="DC_EDUCATION")
@Data
public class DcEducation {

	@Id
	@GeneratedValue
	private Integer eduId;
	private Long caseNum;
	private String highestQualification;
	private Integer graduationYear;
}
