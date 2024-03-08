package in.sid.json.AppJavaToJason.Practice;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Convert {

	public String setObjectToJson() throws StreamWriteException, DatabindException, IOException{

		Order order = new Order();
		
		order.setOName("Laptop");
		order.setOType("Hpi5");
		order.setOId(102);
		order.setOPrice(45000.00);
		
		ObjectMapper mapper =  new ObjectMapper();
		mapper.writeValue(new File("order.json"), order);
		//System.out.println("Converting Process Completed...!!!");
		return "Converting Process Completed...!!!";
	}
	
	public Order convertJsonToJava() throws StreamReadException, DatabindException, IOException {
		
		File jsonFile = new File("order.json");
		
		ObjectMapper mapper = new ObjectMapper();
		
		Order ord = mapper.readValue(jsonFile, Order.class);
		
		return ord;
	}

}
