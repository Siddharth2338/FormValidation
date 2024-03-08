package com.DcApi.Entity;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="PLAN_MASTER")
public class PlanEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PLAN_ID")
	private Integer planId;
	@Column(name="PLAN_NAME")
	private String planName;
	@Column(name="PLAN_STRT-DATE")
	private LocalDate planStartDate;
	@Column(name="PLAN_END-DATE")
	private LocalDate planEndDate;
	@Column(name="ACTIVE_SW")
	private String activeSw;
	@Column(name="PLAN_CATAGORY")
	private Integer planCatagory;
	
}