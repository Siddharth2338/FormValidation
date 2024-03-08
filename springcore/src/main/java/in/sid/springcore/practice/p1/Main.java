package in.sid.springcore.practice.p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("in/sid/springcore/practice/p1/p1confiq.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
	}

}
