package in.String;

public class Pallendrop {
	
	public static void main(String[] args) {
		
		String str ="Madam";
		
		String str1="";
		
		for(int i=0;i<str.length();i++) {
			
			char c=str.charAt(i);
			
			str1=c+str1;
			
		}
		
		if(str.equals(str1)) {
			
			System.out.println("Pallendrom Number");
		}else {
			
		System.out.println("Not A Pallendrom Number");}
		
	}

}
