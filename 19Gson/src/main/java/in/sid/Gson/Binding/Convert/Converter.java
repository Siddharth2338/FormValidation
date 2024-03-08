package in.sid.Gson.Binding.Convert;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import in.sid.Gson.Binding.Product;

public class Converter {

	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {

		Product product = new Product();
		
		product.setPId(101);
		product.setPName("Galaxy-S10");
		product.setCName("Samsung");
		product.setPPrice(45000.00);
		
		Gson gson = new Gson();
		String json = gson.toJson(product);
		
		System.out.println(json);
		
		Product p = gson.fromJson(new FileReader(new File("product.json")), Product.class);
		System.out.println(p);
		
	}

}
