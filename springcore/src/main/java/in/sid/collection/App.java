package in.sid.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("in/sid/collection/collectionconfiq.xml");
		
		Student student = (Student) context.getBean("student1");
		
		System.out.println(student.getName());
		System.out.println(student.getPhones());
		System.out.println(student.getAddresses());
		System.out.println(student.getCourses());
		
		
	}

}
