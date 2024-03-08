package FlatMapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		
		//map()
		
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6);
		
		//List<Integer> list2=list1.stream().map(n-> n+10).collect(Collectors.toList());
		//System.out.println(list2);
		//list1.stream().map(n-> n+10).forEach(System.out::println);
		
		List<Integer> lst1=Arrays.asList(1,2);
		List<Integer> lst2=Arrays.asList(3,4);
		List<Integer> lst3=Arrays.asList(5,6);
	
//		List<List<Integer>> fLits=Arrays.asList(lst1,lst2,lst3);
//		System.out.println(fLits);
		
//		List<Integer> finalList = new ArrayList<Integer>();
//		for(int i:lst1)
//		{
//			finalList.add(i);
//		}
//		System.out.println(finalList);
//		for(int i:lst2)
//		{
//			finalList.add(i);
//		}
//		System.out.println(finalList);
//		for(int i:lst3)
//		{
//			finalList.add(i);
//		}
//		System.out.println(finalList);
		List<List<Integer>> fLits=Arrays.asList(lst1,lst2,lst3);
		
//		List<Integer> lstFinal = new ArrayList<Integer>();
//		lstFinal.addAll(lst1);
//		lstFinal.addAll(lst2);
//		lstFinal.addAll(lst3);
//		System.out.println(lstFinal);
		//List<Integer>flst1=fLits.stream().flatMap(f-> f.parallelStream()).collect(Collectors.toList());
		List<Integer>flst1=fLits.stream().flatMap(f-> f.stream()).filter(y->y%2==0).map(x->x+10).collect(Collectors.toList());
		
		System.out.println(flst1);
		
	}

}
