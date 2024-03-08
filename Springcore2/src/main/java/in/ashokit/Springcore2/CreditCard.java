package in.ashokit.Springcore2;

public class CreditCard implements Ipayment {

	@Override
	public String pay(double amt) {
		
		return "Payment succesful through Credit card";
	}

}
