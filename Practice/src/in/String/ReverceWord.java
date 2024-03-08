package in.String;

public class ReverceWord {
	
	public static void main(String[] args) {
		
		String str = "welcome to java world";
		
		String [] splitArray = str.split(" ");
		
		for(int i = splitArray.length-1;i>=0;i--) {
			
			System.out.println(splitArray[i]);
		}
		
		String str1="";
		
		for(int i = 0; i<str.length();i++) {
			
			char c = str.charAt(i);
			
			str1=c+str1;
		}
		
		System.out.println(str1);
	}

}
