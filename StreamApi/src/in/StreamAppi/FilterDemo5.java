package in.StreamAppi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	double price;
	
	 public Product(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		
	}


}

public class FilterDemo5 {
	
	public static void main(String[] args) {
		
	List<Product> prDetails = new ArrayList<Product>();
	
	prDetails.add(new Product(1,"Sonny",20000));
	prDetails.add(new Product(2,"Dell",23000));
	prDetails.add(new Product(3,"HP",25000));
	prDetails.add(new Product(4,"LG",44000));
	prDetails.add(new Product(5,"Apple",90000));
	
	prDetails.stream().filter(str-> str.price >25000).forEach(pr-> System.out.println(pr.price));
		
//		
//		
//		
//		//List<String> prDetail = new ArrayList<>();
//		FilterDemo5 pr1= new FilterDemo5(1,"hp",25000);
//		
//		//prDetail.add(new FilterDemo5(1,"HP",25000));
//		System.out.println("\nId:"+pr1.id+"\nName:"+pr1.name+"\nPrice:"+pr1.price);
//	
	}
	
}
