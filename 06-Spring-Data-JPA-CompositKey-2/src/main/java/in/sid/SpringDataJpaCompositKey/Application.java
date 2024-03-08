package in.sid.SpringDataJpaCompositKey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sid.SpringDataJpaCompositKey.Repository.AccountRepository;
import in.sid.SpringDataJpaCompositKey.Service.AccountService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		AccountService accountService = context.getBean(AccountService.class);
		
		accountService.saveAllData();
		accountService.getDataUsingPK();
	}

}
