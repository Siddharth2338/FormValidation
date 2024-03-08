package FlatMapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		List<String> name1 = Arrays.asList("ram","shyam","suraj","digu","sandip");
		List<String> name2 = Arrays.asList("Siddharth","Suraj","Parmeshwar","Vithal","Mahadev","Viru","Samarth");
		List<String> name3 = Arrays.asList("Gokul","Krishna","Datta","Balu","Njam","Rama","Vishal");
		
		List<String> finalName=new ArrayList<String>();
		finalName.addAll(name1);
		finalName.addAll(name2);
		finalName.addAll(name3);
		
		System.out.println(finalName);
		
		//List<String>flst1=finalName.stream().flatMap(f-> f.)//.collect(Collectors.toList());
		//finalName.stream().flatMap(f-> f.)
	}

}
