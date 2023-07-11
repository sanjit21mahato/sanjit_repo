package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Pet{
	String name;
	int price;
	double weight;
	
	public Pet(String name, int price, double weight){
		super();
		this.name=name;
		this.price=price;
		this.weight=weight;
	}
}

public class FilterUsingLambdaExpression {

	public static void main(String[] args) {

    List<Pet> petList =new ArrayList<Pet>();
    petList.add(new Pet("Dog", 2500, 2.0));
    petList.add(new Pet("Cat",1000, 1.0));
    petList.add(new Pet("Parrot",500,.5));
    
     List<Pet> list =  petList.stream().filter(p->p.price>=1000).collect(Collectors.toList());
    // Stream<Pet> list =  petList.stream().filter(p->p.price>=1000);
     list.forEach(p->System.out.println(p.name));

	}

}
