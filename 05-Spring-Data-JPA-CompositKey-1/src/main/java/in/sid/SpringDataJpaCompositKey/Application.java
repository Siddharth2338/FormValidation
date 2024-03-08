package in.sid.SpringDataJpaCompositKey;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sid.SpringDataJpaCompositKey.Entity.Account;
import in.sid.SpringDataJpaCompositKey.Repository.AccountRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		AccountRepository accountRepository = context.getBean(AccountRepository.class);
		
		Account a6 = new Account();
		a6.setAccId(6);
		a6.setAccNo(6789);
		a6.setAccType("Saving");
		a6.setBranchName("Siddharth");
		
		accountRepository.save(a6);
		//accountRepository.delete(a6);
		
		
//		Account a1 = new Account(1234,"Saving","Smith");
//		Account a2 = new Account(2345,"Currunt","Charli");
//		Account a3 = new Account(3456,"Saving","john");
//		Account a4 = new Account(4567,"Saving","Peter");
//		Account a5 = new Account(5678,"Currunt","Ganesh");
		
//		List<Account> account = accountRepository.saveAll(Arrays.asList(a1,a2,a3,a4,a5));
//		account.forEach(accoun ->{System.out.println(accoun);});
	}

}
