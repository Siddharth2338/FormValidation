package in.sid.SpringDataJpaTimeStamping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.repository.CrudRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ProductRepository productRepository=context.getBean(ProductRepository.class);
		
		Product p1=new Product();
		p1.setProductID(101);
		p1.setProductName("Mouse");
		p1.setProductPrice(500);
		
		Product p2=new Product();
		//p2.setProductID(102); for generatedvalue auto id will be generated
		p2.setProductName("Monitor");
		p2.setProductPrice(8000);
		
		productRepository.save(p2);
		
		
		
	}

}
