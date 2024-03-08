package in.sid.collection.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
	ApplicationContext context = new ClassPathXmlApplicationContext("in/sid/collection/ref/collectionrefconfiq.xml");
	
	ClassA a = (ClassA) context.getBean("aref");
	
	//System.out.println(a);
	System.out.println(a.getX());
	System.out.println(a.getOb().getY());
	System.out.println(a);
	}

}
