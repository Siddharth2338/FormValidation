package in.Practice;

public class P2 {

	public static void main(String[] args) {
		
		String s="Siddharth jadhav from latur";
		
//		int i=s.length();
//		System.out.println(i);
//		}
		
//		System.out.println(s.replace('t', 'p'));
//		System.out.println(s.replace("from", "to"));
//		System.out.println(s.concat("Siddharthjadhav"));
//		System.out.println(s.replaceAll("Siddharth jadhav from latur", "hdgisnd,bfihhhjf"));
		//System.out.println(s.("Siddharthjadhav"));
		char ch;
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
}
}