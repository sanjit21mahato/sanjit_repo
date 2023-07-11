package methodReference;

@FunctionalInterface
interface Sayable{
	public void say();
}

public class StaticMethodReference {
	public static void saySomething(){
		System.out.println("say something");
	}

	public static void main(String[] args) {
		
//		Sayable sayable = ()->{
//			System.out.println("saying something");
//		};
		Sayable sayable = StaticMethodReference::saySomething;
		sayable.say();

	}

}
