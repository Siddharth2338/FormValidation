package in.ashokit.Springcore2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("in/ashokit/Springcore2/NewFile.xml");
		BillCollector bc = (BillCollector) context.getBean("billcoll");
		bc.collectPayment(1400.00);
		
	}

}
