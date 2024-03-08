package in.Practice;

public class BillCollector {

	private Ipayment payment;
	
	public void setPayment(Ipayment payment) {
		this.payment=payment;
	}
	
//	public BillCollector() {}
//	public BillCollector(Ipayment payment) {
//		this.payment=payment;
//	}
//	
	
	public void collectBill(double amt)
	{
		String status=payment.pay(amt);
		System.out.println(status);
	}
}
