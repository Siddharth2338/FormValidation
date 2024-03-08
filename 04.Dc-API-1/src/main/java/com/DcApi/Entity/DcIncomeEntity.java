package com.DcApi.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="DC_INCOME")
@Data
public class DcIncomeEntity {
	
	@Id
	@GeneratedValue
	private Integer incomeId;
	private Long caseNum;
	private Double empIncome;
	private Long propertyIncome;

}
