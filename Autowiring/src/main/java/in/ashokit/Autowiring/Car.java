package in.ashokit.Autowiring;

public class Car {
	
	private DieselEngine dieselEng;
	
	
	public void setDieselEng(DieselEngine dieselEng) {
		this.dieselEng = dieselEng;
	}

	public Car() {
		System.out.println("Car::constructor");
	}
	
	public void drive() {
		int start = dieselEng.start();
		if(start >= 1)
		{
			System.out.println("journey started....");
		}else {
			System.out.println("engine failed to start..!!");
		}
	}
	

}
