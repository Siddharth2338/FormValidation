package in.AshokIt.SpringCore.FirstApp;

public class DebitCard implements Ipayment {

	@Override
	public String pay(double amt) {
		// TODO Auto-generated method stub
		return "payment succesful through Debit Card";
	}

}