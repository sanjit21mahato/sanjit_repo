package lambdaExpression;

@FunctionalInterface
interface Drive{
	public void drive();
}

public class ImplementUsingLamdaExpression {
  static int speed =40;
	public static void main(String[] args) {
	
		Drive d = ()->{System.out.println("Driving speed is: "+ speed);};
		//d.drive();
		//passMethodAsArgument(d);
		passMethodAsArgument(()->{System.out.println("Driving speed is: "+ speed);});
	}
	private static void passMethodAsArgument(Drive d) {
		d.drive();
		
	}
}
