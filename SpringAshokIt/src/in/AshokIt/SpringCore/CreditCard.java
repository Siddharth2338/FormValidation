package in.AshokIt.SpringCore;

public class CreditCard implements Ipayment {

	@Override
	public String pay(double amt) {
		
		return "Payment succesful through Credit card";
	}

}
