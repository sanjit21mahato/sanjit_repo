package lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	String name;
	int price;
	double weight;
	
	public Product(String name, int price, double weight){
		this.name=name;
		this.price=price;
		this.weight=weight;
	}
	
}

public class ComparatorUsingLambdaExpression {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("mobile", 12000, 0.4));
		productList.add(new Product("laptop", 32000, 0.8));
		productList.add(new Product("tv", 10000, 1.5));
		
	    Collections.sort(productList, (p1,p2)-> {
	    	return p1.name.compareTo(p2.name);
	    });
		
		productList.forEach(n->{
			System.out.println(n.name);
		});
		

	}

}
