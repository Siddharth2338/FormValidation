package in.String;

public class EvenLengthPrint {

	public static void main(String[] args) {
		
		String str = "Hell World";
	
		
		for(String s:str.split(" ")) {
			
			if(s.length()%2==0) {
				
				System.out.println(s);
			}
		}
	}
	

}