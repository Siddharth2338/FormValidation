package in.sid.springcore.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("in/sid/springcore/practice/practiceconfiq.xml");
		Student std1 = (Student) context.getBean("std");
		
		System.out.println(std1);
		System.out.println(std1.getClass().getName());
	}

}
