package in.String;

import java.util.Scanner;

public class OwelInString {

	public static void main(String[] args) {

		
		System.out.println("Enter Some String");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		
		int count=0;
		
		for(char c : ch) {
			
			switch(c){
				
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				
				count++;
				break;
			
			}
		}
		
		System.out.println(count);
	}

}
