package com.DcApi.Entity.Binding;

import java.util.List;

import lombok.Data;

@Data
public class DcSummary {

	
	private Education education;
	private Income income;
	private List<Child> child;
	private String planName;
}
