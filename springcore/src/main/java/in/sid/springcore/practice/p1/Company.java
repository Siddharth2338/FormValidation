package in.sid.springcore.practice.p1;

public class Company 
{
	private String Company_Name;

	public String getCompany_Name()
	{
		return Company_Name;
	}

	public void setCompany_Name(String company_Name) 
	{
		Company_Name = company_Name;
	}

	
	public Company(String company_Name) 
	{
		super();
		Company_Name = company_Name;
	}

	@Override
	public String toString() 
	{
		return "Company [Company_Name=" + Company_Name + "]";
	}
	
}
