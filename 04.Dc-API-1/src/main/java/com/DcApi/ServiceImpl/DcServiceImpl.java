package com.DcApi.ServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DcApi.Entity.CitizenAppEntity;
import com.DcApi.Entity.DcCaseEntity;
import com.DcApi.Entity.DcChildren;
import com.DcApi.Entity.DcEducation;
import com.DcApi.Entity.DcIncomeEntity;
import com.DcApi.Entity.PlanEntity;
import com.DcApi.Entity.Binding.Child;
import com.DcApi.Entity.Binding.ChildRequest;
import com.DcApi.Entity.Binding.DcSummary;
import com.DcApi.Entity.Binding.Education;
import com.DcApi.Entity.Binding.Income;
import com.DcApi.Entity.Binding.PlanSelection;
import com.DcApi.Repository.CitizenAppRepo;
import com.DcApi.Repository.DcCaseRepo;
import com.DcApi.Repository.DcChildrenRepo;
import com.DcApi.Repository.DcEducationRepo;
import com.DcApi.Repository.DcIncomeRepo;
import com.DcApi.Repository.PlanRepo;
import com.DcApi.Service.DcService;
@Service
public class DcServiceImpl implements DcService {

	@Autowired
	private DcCaseRepo dcCaseRepo;
	@Autowired
	private PlanRepo planRepo;
	@Autowired
	private DcIncomeRepo incomeRepo;
	@Autowired
	private DcEducationRepo eduRepo;
	@Autowired
	private DcChildrenRepo childRepo;
	@Autowired
	private CitizenAppRepo appRepo;
	@Override
	public Long loadCaseNumber(Integer appId) {
		
		Optional<CitizenAppEntity> id = appRepo.findById(appId);
		if(id.isPresent()) {
			DcCaseEntity entity = new DcCaseEntity();
			entity.setAppId(appId);
			dcCaseRepo.save(entity);
			return entity.getCaseNum();
		}
		return 0l;
		
//		DcCaseEntity entity = dcCaseRepo.findByAppId(appId);
//		if(entity != null) {
//			return entity.getCaseNum();
//		}
//		return null;
	}

	@Override
	public Map<Integer, String> getPlanNames() {

		List<PlanEntity> list = planRepo.findAll();
		
		Map<Integer, String> planMap = new HashMap<>();
		for(PlanEntity entity : list) {
			planMap.put(entity.getPlanId(), entity.getPlanName());
		}
		return planMap;
	}

	@Override
	public Long savePlanSelection(PlanSelection planSelection) {
		
		Optional<DcCaseEntity> findById = dcCaseRepo.findById(planSelection.getCaseNum());
		if(findById.isPresent()) {
			DcCaseEntity dcCaseEntity = findById.get();
			dcCaseEntity.setPlanId(planSelection.getPlanId());
			dcCaseRepo.save(dcCaseEntity);
			
			return planSelection.getCaseNum();
		}
		return null;

//		DcCaseEntity entity = new DcCaseEntity();
//		entity.setPlanId(planSelection.getPlanId());
//		entity.setAppId(planSelection.getAppId());
//		
//		entity = dcCaseRepo.save(entity);
//		
//		if(entity.getCaseNum() != null) {
//			
//			return entity.getCaseNum();
//		}
//		
//		return null;
	}

	@Override
	public Long saveIncomeData(Income income) {
		
		DcIncomeEntity entity = new DcIncomeEntity();
		BeanUtils.copyProperties(income, entity);
		
		incomeRepo.save(entity);
		return entity.getCaseNum();
	}

	@Override
	public Long saveEducationData(Education education) {
		
		DcEducation entity = new DcEducation();
		BeanUtils.copyProperties(education, entity);
		
		eduRepo.save(entity);
		return entity.getCaseNum();
	}

	@Override
	public Long saveChildrens(ChildRequest request) {
		
		List<Child> childs = request.getChilds();
		
		for(Child c : childs) {
			
			DcChildren childrens = new DcChildren();
			BeanUtils.copyProperties(c, childs);
			childRepo.save(childrens);
		}
		return request.getCaseNum();
	}

	@Override
	public DcSummary getDcSummary(Long caseNumber) {
		
		String planName = "";
		DcEducation dcEducationEntity = eduRepo.findByCaseNum(caseNumber);
		DcIncomeEntity dcIncomeEntity = incomeRepo.findByCaseNum(caseNumber);
		List<DcChildren> dcChildEntity = childRepo.findByCaseNum(caseNumber);
		
		Optional<DcCaseEntity> optional = dcCaseRepo.findById(caseNumber);
		if(optional.isPresent()) {
			
			Integer planId = optional.get().getPlanId();
			Optional<PlanEntity> plan = planRepo.findById(planId);
			if(plan.isPresent()) {
				planName = plan.get().getPlanName();
				
			}
		}
		
		DcSummary summary = new DcSummary();
		summary.setPlanName(planName);
		
		Income income = new Income();
		BeanUtils.copyProperties(dcIncomeEntity, income);
		summary.setIncome(income);
		
		Education edu = new Education();
		BeanUtils.copyProperties(dcEducationEntity, edu);
		summary.setEducation(edu);
		
		List<Child> childs = new ArrayList<Child>();
		for(DcChildren entity : dcChildEntity) {
			
			Child ch = new Child();
			BeanUtils.copyProperties(entity, ch);
			childs.add(ch);
		}
		summary.setChild(childs);
		
		return summary;
	}

}
