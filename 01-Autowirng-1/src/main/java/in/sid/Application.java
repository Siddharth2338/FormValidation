package in.sid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sid.service.ReportService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
		SpringApplication.run(Application.class, args);
		
		ReportService reportservice = context.getBean(ReportService.class);
		 reportservice.generateReport();
		System.out.println(reportservice);
	}

}
