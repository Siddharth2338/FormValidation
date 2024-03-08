package in.String;

import java.util.HashSet;
import java.util.Set;

public class StringPractice {

	
	public static void main(String[] args) {
		
		String str="Sandeep";
		
		StringPractice sp = new StringPractice();
		
		String string = sp.removeDupicate(str);
		System.out.println(string);
		
	}
	
	public String removeDupicate(String str) {
		
		Set<Character> set = new HashSet<Character>();
		StringBuffer sf = new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			
			char c = str.charAt(i);
			
			if(!set.contains(c)) {
				
				set.add(c);
				sf.append(c);
			}
		}
		
		return sf.toString();
	}
	
}