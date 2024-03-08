package in.AshokIt.SpringCore.FirstApp;

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
		// TODO Auto-generated method stub
		String status= payment.pay(amt);
		
		System.out.println(status);
	}
	
}
