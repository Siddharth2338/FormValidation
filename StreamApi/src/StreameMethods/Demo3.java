package StreameMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {

	public static void main(String[] args) {
		
		List<String> strList=Arrays.asList("A","B","C","1","2","3");
		
		Optional<String>reduced=strList.stream().reduce((value,combineval)->{ return value+combineval;});
		
		System.out.println(reduced.get());
	}

}
