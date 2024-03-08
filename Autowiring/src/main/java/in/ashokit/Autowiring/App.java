package in.ashokit.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("in/ashokit/Autowiring/Autowiring.xml");
       Car car = (Car) context.getBean("car",Car.class);
       car.drive();
       //System.out.println(car);
       
    }
}
