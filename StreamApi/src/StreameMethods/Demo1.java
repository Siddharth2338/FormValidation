package StreameMethods;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//  distinct()    limit()       count()

public class Demo1 {

	public static void main(String[] args) {
		
		List<String> vehicleList=Arrays.asList("bus","bike","bycycle","bike","bus","car","bycycle");		
		//System.out.println(vehicleList);
		
		// distinct() method
		List<String>distinctvehicle = vehicleList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(distinctvehicle);
		
		// count() method
		long count=distinctvehicle.stream().count();
		System.out.println(count);
		
		// limit() method
		List<String> limitedValue=vehicleList.stream().limit(3).collect(Collectors.toList());
		System.out.println(limitedValue);
		
	}

}
