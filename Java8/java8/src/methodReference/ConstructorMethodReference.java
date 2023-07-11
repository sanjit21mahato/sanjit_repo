package methodReference;
interface Messageable{
	void getMessage(String message);
}

class Message{
	Message(String msg){
		System.out.println(msg);
	}
}

public class ConstructorMethodReference {

	public static void main(String[] args) {
		Messageable m = Message::new;
        m.getMessage("hello");
	}

}
