package in.sid.json.AppJavaToJason;

import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;

import in.sid.json.AppJavaToJason.Practice.Convert;
import in.sid.json.AppJavaToJason.Practice.Order;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws StreamWriteException, DatabindException, IOException
    {
    	Convert convert = new Convert();
    	String obj = convert.setObjectToJson();
    	System.out.println(obj);
        System.out.println( "Json file Created Succesfully....!!" );
        
        System.out.println("###########################################");
        
        Order ob1 = convert.convertJsonToJava();
        System.out.println(ob1);
    }
}
