package patronescreacionales.factorymethod;

public class SpanishMessage implements Message {

	@Override
	public void showMessage() {
		System.out.println("Hola Mundo desde Factory Method (Español)");
	}

}
