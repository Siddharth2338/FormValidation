package in.sid.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("in/sid/constructor/injection/constructorconfiq.xml");
		
		Person p = (Person) context.getBean("person");
		
		System.out.println(p);
		
		//Addition add1 = (Addition) context.getBean("add");
		//add1.sum();
		
	}

}
