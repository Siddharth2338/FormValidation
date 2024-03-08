package in.AshokIt.SpringCore;

public class Test {

	public static void main(String[] args)
	{
		// Using Setter Injection
		
		BillCollector bc=new BillCollector();
		bc.setPayment(new CreditCard());
		bc.collectPayment(150.00);
		
		// using Constructor Injection
//		BillCollector bc1 = new BillCollector(new Upi());
//		bc1.collectPayment(150.00);
	}

}
