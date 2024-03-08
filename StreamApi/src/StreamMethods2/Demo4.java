package StreamMethods2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {

	public static void main(String[] args) {
		
		List<String> animals=Arrays.asList("dog","elephant","lion");
		List<String> birds=Arrays.asList("peacock","crow","parrot","eagle");
		
		Stream<String>stm1=animals.stream();
		Stream<String>stm2=birds.stream();
		
		List<String>finalList=Stream.concat(stm1, stm2).collect(Collectors.toList());
		System.out.println(finalList);
		

	}

}
