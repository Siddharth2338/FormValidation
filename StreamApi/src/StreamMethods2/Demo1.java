package StreamMethods2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 
{

	public static void main(String[] args) 
	{
		
		List<Integer> list1=Arrays.asList(2,4,1,3,5,7,4,6);
		
//		for(int i:list1)
//		{
//			System.out.println(i);
//		}
		/*System.out.println(list1);
		
		Collections.sort(list1);
		System.out.println(list1);*/
		
		List<Integer> sortedList=new ArrayList<Integer>();
		
		sortedList=list1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		List<Integer>reverseList=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseList);
		
		List<String> names = Arrays.asList("ram","shyam","suraj","digu","sandip");
		
		List<String>sortedname=names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedname);
		
		List<String>reversesortedname=names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reversesortedname);
}
}