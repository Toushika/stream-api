package com.enigma.dev;

import com.enigma.dev.checkInfoUtility.CheckInfoUtility;
import com.enigma.dev.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class StreamApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamApiApplication.class, args);
		List<Product> productList= new ArrayList<>();
		Product product = new Product();
		Product prod= new Product(1, "Laptop", 20000);
		productList.add(prod);
		prod= new Product(2, "Computer", 200000);
		productList.add(prod);
		prod= new Product(3, "CPU", 65000);
		productList.add(prod);
		prod= new Product(4, "UPS", 5000);
		productList.add(prod);

		List<Product>newProductList=new ArrayList<>();
		CheckInfoUtility checkInfoUtility = new CheckInfoUtility();
		checkInfoUtility.checkPrice(productList,newProductList);
	}

}

