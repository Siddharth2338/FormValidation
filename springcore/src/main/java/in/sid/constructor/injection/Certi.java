package in.sid.constructor.injection;

public class Certi 
{
	
	 String name;

	public Certi(String name)
	{
		super();
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return this.name;
		//return "Certi [name=" + name + "]";
	}
	
	
	
	
	
	
	/*public Certi(String certi)
	{
		this.certi=certi;
	}
	
	public String toString()
	{
		return this.certi;
		
	}*/
}
