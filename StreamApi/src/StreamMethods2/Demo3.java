package StreamMethods2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {

	public static void main(String[] args) {
		
		//findAny()
//		List<String> strList=Arrays.asList("one","two","three","one");
//		
//		Optional<String> val=strList.stream().findAny();
//		System.out.println(val.get());
		
		// findFirst()
		List<String> strList=Arrays.asList("one","two","three","one");
		Optional<String>result=strList.stream().findFirst();
		System.out.println(result.get());
	}

}
