package in.StreamApi.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

	public static void main(String[] args) {
		
		List<Integer> numList=Arrays.asList(2,3,4,5);
		List<Integer> numList2 = new ArrayList<Integer>();
		
		// beofre Stream
//		for(int i : numList)
//		{
//			
//			numList2.add(i*3);
//			//System.out.println(i*3);
//		}
//		System.out.println(numList2);
		
		// using Stream
		
//		numList2=numList.stream().map(num->num*3).collect(Collectors.toList());
//		System.out.println(numList2);
		
		numList.stream().map(num->num*3).forEach(System.out::println);
	}

}
