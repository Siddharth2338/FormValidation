package StreameMethods;

import java.util.Arrays;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		
		List<String> strList=Arrays.asList("A","B","C","1","2","3");
		
		Object arr[]=strList.stream().toArray();
		
		for(Object a:arr)
		{
			System.out.println(a);
		}
		
		System.out.println(arr.length);
	}

}
