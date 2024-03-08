package in.sid.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("in/sid/springcore/autowire/autowireconfiq.xml");
		
		Emp emp1 = (Emp) context.getBean("emp");
		System.out.println(emp1);

	}

}
