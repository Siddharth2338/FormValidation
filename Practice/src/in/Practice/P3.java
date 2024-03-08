package in.Practice;

public class P3 extends Thread {
	
	public void t1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	
	public void t2()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Thread th = new Thread();
		
		
		
	}
}
