package in.AshokIt.SpringCore.FirstApp;

public class CreditCard implements Ipayment {

	@Override
	public String pay(double amt) {
		
		return "Payment succesful through Credit card";
	}

}
