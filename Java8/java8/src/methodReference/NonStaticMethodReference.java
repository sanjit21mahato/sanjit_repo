package methodReference;

interface Draw{
	public void draw();
}

public class NonStaticMethodReference {
     public void drawing(){
    	 System.out.println("drawing..");
     }
	
	public static void main(String[] args) {
		//NonStaticMethodReference n = new NonStaticMethodReference();
		//Draw d = n::drawing;
		Draw d = new NonStaticMethodReference()::drawing;
        d.draw();
	}

}
