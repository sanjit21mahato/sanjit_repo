package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Laptop{
	String name ;
	double price;
	int screenSize;
	
	public Laptop(String name,double price, int screenSize){
		this.name= name;
		this.price= price;
		this.screenSize= screenSize;
	}
}

public class FilterUsingStream {

	public static void main(String[] args) {
		List<Laptop> laptopList = new ArrayList<Laptop>();
		laptopList.add(new Laptop("HP", 35000, 14));
		laptopList.add(new Laptop("Lenovo", 32000, 14));
		laptopList.add(new Laptop("Compaq", 30000, 14));
		laptopList.add(new Laptop("Apple", 45000, 14));
		//fetching laptop list based on filter 
		List<Laptop> filterdList = laptopList.stream().
				                     filter(l->l.price>30000).collect(Collectors.toList());
	    filterdList.forEach(e->{
		   System.out.println(e.name);
	    });
	    
	    //fetching name of of the laptop from the filtered list
	    //map is used above to prepare another list from filtered list based on some attribute of the list
	    List<String> name = laptopList.stream().filter(l->l.price>30000).
	    		                                 map(l->l.name).collect(Collectors.toList());
        
	    System.out.println(name);
        
        // More compact way of filtering and printing laptop name
	    laptopList.stream().filter(l->l.price>30000).forEach(l->{
	    	System.out.println(l.name);
	    });
	    
	    //Another way to filter and print using method reference
	    laptopList.stream().filter(l->l.price>30000).map(l->l.name).forEach(System.out::println);
	    
	}

}
