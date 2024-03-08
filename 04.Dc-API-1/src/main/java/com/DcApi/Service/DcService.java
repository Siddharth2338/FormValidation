package com.DcApi.Service;

import java.util.List;
import java.util.Map;

import com.DcApi.Entity.Binding.Child;
import com.DcApi.Entity.Binding.ChildRequest;
import com.DcApi.Entity.Binding.DcSummary;
import com.DcApi.Entity.Binding.Education;
import com.DcApi.Entity.Binding.Income;
import com.DcApi.Entity.Binding.PlanSelection;

public interface DcService {
	
	public Long loadCaseNumber(Integer appId);
	
	public Map<Integer, String> getPlanNames();
	
	public Long savePlanSelection(PlanSelection planSelection);
	
	public Long saveIncomeData(Income income);
	
	public Long saveEducationData(Education education);
	
	public Long saveChildrens(ChildRequest request);
	
	public DcSummary getDcSummary(Long caseNumber);

}
