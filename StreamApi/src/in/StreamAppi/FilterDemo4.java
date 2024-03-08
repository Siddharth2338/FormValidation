package in.StreamAppi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo4 {

	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Siddharth",null,"Parmeshwar",null,"Mahadev",null,"Samarth");
		
		//List<String> withoutNull = new ArrayList<String>();
		
		List<String> list = names.stream().filter(str-> str!=null).collect(Collectors.toList());
		
		System.out.println(names);
		System.out.println(list);
		
	}

}
