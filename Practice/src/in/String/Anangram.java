package in.String;

import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

public class Anangram {
	
	public static void main(String[] args) {
		
		String str1="java";
		String str2="vaja";
		
		boolean checkAnagram = Anangram.checkAnagram(str1, str2);
		
		System.out.println(checkAnagram);
		
		}
	
	public static boolean checkAnagram(String str1,String str2) {
		
		char[] string1 = str1.toCharArray();
		char[] string2 = str2.toCharArray();
		
		Arrays.sort(string1);
		Arrays.sort(string2);
		
//		if(string1.equals(string2)) {
//			System.out.println("Anagram");
//		}else {System.out.println("not Anagra");}
		
		return Arrays.equals(string1, string2);
	}

}
