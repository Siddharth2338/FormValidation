package in.Practice.thread;

public class Mythread3 extends Thread
{
	public void run()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println("Thread3="+i);
			try {
			Thread.sleep(1000);
		}catch(Exception e)
			{
			}
			}
	}
}
