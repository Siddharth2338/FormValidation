package in.Practice.thread;

public class Mythread2 {

	public static void main(String[] args) {
		
		Mythread t1 = new Mythread();
		Thread t2 = new Thread(t1);
		Mythread3 t3=new Mythread3();
		t2.start();
		t3.start();
	}

}
