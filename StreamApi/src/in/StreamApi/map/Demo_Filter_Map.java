package in.StreamApi.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	int id;
	String name;
	double salary;
	
	public Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}
public class Demo_Filter_Map {

	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
					new Employee(1,"sid",20000),
					new Employee(1,"sidd",30000),
					new Employee(1,"sand",40000),
					new Employee(1,"ram",50000),
					new Employee(1,"ksihor",60000));
		
		List<Double> salList = new ArrayList<Double>(); 
		
		salList=empList.stream().filter(sal-> sal.salary>30000).map(sall->sall.salary).collect(Collectors.toList());
		
		System.out.println(salList);
	}

}
