package in.sid.App17.ConvertedXml;

import java.io.File;

import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import in.sid.App17.Binding.Person;

public class Convert {

	 public static void main( String[] args ) throws Exception {
		
		Person person = new Person();
		person.setId(101);
		person.setName("Siddharth");
		person.setPhno("356893465");
		person.setAge(32);
		
		JAXBContext instance = JAXBContext.newInstance(Person.class);
		Marshaller marshaller =	instance.createMarshaller();
		marshaller.marshal(person,new File("person.xml"));
		
		System.out.println("Marshal Is Created");
	}
}
