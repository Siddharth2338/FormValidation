package in.String;

public class CountOfStrings {
	
	static void count(String str) {
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
		
			String s1 = "";
			
			while(i<ch.length && ch[i]!=' ') {
				s1=s1+ch[i];
				i++;
				}
			
			if(s1.length() > 0) {
				
				System.out.println(s1+"="+s1.length());
			}		
		}
	}	
	public static void main(String[] args) {
		
		String str = "Hello World";
		
		CountOfStrings.count(str);
	}

}
