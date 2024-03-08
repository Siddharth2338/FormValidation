package in.StreamAppi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {

	public static void main(String[] args) {
		
		List<String> list3 = Arrays.asList("Siddharth","Suraj","Parmeshwar","Vithal","Mahadev","Viru","Samarth");
		
		System.out.println(list3);
		
		List<String> list = list3.stream().filter(str-> str.length()>5 && str.length()<8).collect(Collectors.toList());
		
		System.out.println(list);

	}

}
