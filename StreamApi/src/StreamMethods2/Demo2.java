package StreamMethods2;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		
		Set<String> frutes=new HashSet<String>();
		
		frutes.add("one mango");
		frutes.add("two lemon");
		frutes.add("two strawberry");
		frutes.add("one orange");
		frutes.add("more apple");
		
		//System.out.println(frutes);
		
		// anyMatch
		boolean value=frutes.stream().anyMatch(val-> {return val.startsWith("one");});
		System.out.println(value);
		
		// alllMatch
		boolean value1=frutes.stream().allMatch(val-> {return val.startsWith("one");});
		System.out.println(value1);
		
		// nonelMatch
		boolean value3=frutes.stream().noneMatch(val-> {return val.startsWith("one");});
		System.out.println(value3);
	}

}
