package in.ashokit.Springcore2;

public class BillCollector {
	
	private Ipayment payment;
	
	public BillCollector(){
	}
	public BillCollector(Ipayment payment) {	
		this.payment=payment;
	}

	public void setPayment(Ipayment payment) {
		this.payment = payment;
	}
	
	public void collectPayment(double amt) {
		System.out.println(payment.getClass().getName());

		String status= payment.pay(amt);
		
		System.out.println(status);
	}
	
}
