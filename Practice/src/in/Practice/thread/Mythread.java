package in.Practice.thread;

public class Mythread implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread ="+i);
			
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Mythread t1 = new Mythread();
		Thread t2 = new Thread(t1);
		
		t2.start();
		
	}
}
