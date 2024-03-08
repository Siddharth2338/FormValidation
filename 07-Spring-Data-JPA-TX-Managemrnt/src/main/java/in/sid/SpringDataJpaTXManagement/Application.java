package in.sid.SpringDataJpaTXManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sid.SpringDataJpaTXManagement.Service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserService user = context.getBean(UserService.class);
		
		user.addUser();
	}

}
