package in.ashokit.BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext contect = new ClassPathXmlApplicationContext("in/ashokit/BeanScope/BeanScope.xml");	
		
	}

}
