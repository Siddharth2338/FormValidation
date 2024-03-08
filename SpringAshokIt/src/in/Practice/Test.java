package in.Practice;

public class Test {

	public static void main(String[] args) {
		
//		BillCollector bc = new BillCollector(new CreditCard());
//		bc.collectBill(1500.00);
		
		BillCollector bc1 = new BillCollector();
		bc1.setPayment(new Upi());
		bc1.collectBill(1400.00);
	}

}
