package in.StreamAppi;

import java.util.ArrayList;
import java.util.List;

class ProductP
{
	int id;
	String name;
	double price;
	
	public ProductP(int id , String name , double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

public class SilterDemo2 {

	public static void main(String[] args) 
	{
		List<Product> productlist = new ArrayList<Product>();
		
		productlist.add(new Product(1,"HP",23000));
		productlist.add(new Product(2,"Apple",90000));
		productlist.add(new Product(3,"Sonny",28000));
		productlist.add(new Product(4,"Dell",30000));
		productlist.add(new Product(5,"LG",20000));
		
		productlist.stream().filter(p -> p.price > 25000).forEach(pr -> System.out.println(pr.price));
		
	
	}

}
