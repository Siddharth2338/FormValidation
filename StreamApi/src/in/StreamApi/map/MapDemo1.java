package in.StreamApi.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args)
	{
		List<String> names = Arrays.asList("ram","shyam","suraj","digu","sandip");
		List<String> upperCaseName= new ArrayList<String>();
		
//		for(String i:names)
//		{
//			upperCaseName.add(i.toUpperCase());
//		}
		
		upperCaseName=names.stream().map(name-> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCaseName);
	}

}
