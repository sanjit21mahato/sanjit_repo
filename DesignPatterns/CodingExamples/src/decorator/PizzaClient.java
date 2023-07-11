package decorator;

public class PizzaClient {

	public static void main(String[] args) {
	
		BasePizza vegDelight = new VegDelight();
		BasePizza pizza = new Mushroom(vegDelight);
		System.out.println(pizza.cost());

	}

}
