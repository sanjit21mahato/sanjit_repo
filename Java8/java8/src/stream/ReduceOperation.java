package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Mobile{
	String name;
	int price;
	
	Mobile(String name, int price){
		this.name=name;
		this.price=price;
	}
}

public class ReduceOperation {

	public static void main(String[] args) {
		
		List<Mobile> mobileList = new ArrayList<Mobile>();
		mobileList.add(new Mobile("Samsung", 15000));
		mobileList.add(new Mobile("Motorola",12000));
		mobileList.add(new Mobile("Apple", 20000));
		
		//reduce function to get sum of price 
		int totalPrice = mobileList.stream().map(m->m.price).reduce(0, (sum,price)->sum+price);
		System.out.println(totalPrice);
		
		//more precise code
		int sumPrice = mobileList.stream().map(m->m.price).reduce(0, Integer::sum);
		System.out.println(sumPrice);
		
		//Another way
		int sum = mobileList.stream().collect(Collectors.summingInt(m->m.price));
		System.out.println(sum);
		

	}

}
