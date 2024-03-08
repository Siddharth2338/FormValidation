package in.Practice.thread;

public class ThreadOperation {

	public static void main(String[] args) {
		
		System.out.println("Operation Started...");
		int i=35+36;
		System.out.println("sum="+i);
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		t.setName("myname");
		try{Thread.sleep(5000);}catch(Exception e) {}
		System.out.println(t.getName());
		System.out.println("Operation Started...");
	}

}
