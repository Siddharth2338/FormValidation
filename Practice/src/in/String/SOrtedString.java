package in.String;

import java.util.Arrays;

public class SOrtedString {
	
	public static void main(String[] args) {
		
		String str = "java";
		
		char [] ch = str.toCharArray();
		
		Arrays.sort(ch);
		
		String sortedString = new String(ch);
		
		System.out.println(sortedString);
		
	}

}
