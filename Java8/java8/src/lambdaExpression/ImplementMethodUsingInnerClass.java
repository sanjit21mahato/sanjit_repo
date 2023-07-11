package lambdaExpression;

interface Draw{
	public void draw();
}

public class ImplementMethodUsingInnerClass {
	static int width =10;

	public static void main(String[] args) {
		Draw d = new Draw(){
			public void draw() {
				System.out.println("Drawing: "+ width);
			}
		};
       d.draw();
	}

}
