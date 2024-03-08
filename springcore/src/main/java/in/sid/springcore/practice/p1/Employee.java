package in.sid.springcore.practice.p1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee 
{
	private String name;
	private int salary;
	private List<String> addresses;
	private Set<String> phones;
	private Map<String,Integer> department;
	private Company company;
	
	public Employee(String name, int salary, List<String> addresses, Set<String> phones,
			Map<String, Integer> department, Company company)
	{
		super();
		this.name = name;
		this.salary = salary;
		this.addresses = addresses;
		this.phones = phones;
		this.department = department;
		this.company = company;
	}

	@Override
	public String toString() 
	{
		return "Employee [name=" + name + ","
				+ " salary=" + salary + ","
						+ " addresses=" + addresses + ","
								+ " phones=" + phones
									+ ", department=" + department + ","
										+ " company=" + company + "]";
	}
	
	
	
}
