package in.Java8;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {
		
		String str=null;
		
//		if(str==null) {
//		System.out.println("String is null");
//		}else {
//			System.out.println(str.length());
//		}
		
		Optional<String> optional = Optional.ofNullable(str);
		System.out.println(optional);
		System.out.println(optional.isEmpty());
		
		//System.out.println(optional.get());
		
		String string = optional.orElse("value is not present in string");
		System.out.println(string);
	}

}
