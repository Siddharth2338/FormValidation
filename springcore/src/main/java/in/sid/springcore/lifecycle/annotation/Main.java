package in.sid.springcore.lifecycle.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("in/sid/springcore/lifecycle/annotation/Example/lifecycleconfiq.xml");
		Example e1 = (Example) context.getBean("e1");
		
		context.registerShutdownHook();
		System.out.println(e1);

	}

}
