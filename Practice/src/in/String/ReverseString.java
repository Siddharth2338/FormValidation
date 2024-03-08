package in.String;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="ramesh";
		
		String str1 ="";
		
		for(int i = 0;i<str.length();i++) {
			
			str1=str.charAt(i)+str1;
		}
		System.out.println(str1);

	}

}
