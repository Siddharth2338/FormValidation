package in.StreamApi.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDemo2 {

	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("ram","shyam","suraj","digu","sandip");
		//List<String> length1= new ArrayList<String>();
		
//		for(String i:names)
//		{
//			System.out.println(i.length());
//
//		}
		
		//using stream
		
		//names.stream().map(sname->sname.length()).forEach(len->System.out.println(len));
		names.stream().map(sname->sname.length()).forEach(System.out::println);
		
	}

}
