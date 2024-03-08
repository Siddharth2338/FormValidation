package com.ArApi.ServiceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.ArApi.Binding.CitizenApp;
import com.ArApi.Entity.CitizenAppEntity;
import com.ArApi.Repository.CitizenAppRepo;
import com.ArApi.Service.ArService;

@Service
public class CitizenAppServiceImpl implements ArService{

	@Autowired
	private CitizenAppRepo repo;
	@Override
	public Integer createCitizenApp(CitizenApp app) {
		// Rest Call by using RESTTEMPLATE
		
		String endPointUrl = "http://ssa-web-api.herokuapp.com/ssn/{ssn}";
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<String> restEntity = rt.getForEntity(endPointUrl, String.class, app.getSsn());
		String stateName = restEntity.getBody();
		
		// Rest Call by using WEB CLIENT
		
//		WebClient webClient = WebClient.create();
//		String stateName = webClient.get()
//									.uri(endPointUrl)
//									.retrieve()
//									.bodyToMono(String.class)
//									.block();
		
		if("New Jersey".equals(stateName)) {
			
			CitizenAppEntity entity = new CitizenAppEntity();
			BeanUtils.copyProperties(stateName, entity);
			entity.setStatename(stateName);
			CitizenAppEntity save = repo.save(entity);
			
			return save.getAppId();
			
		}
		
		return 0;
	}

}
