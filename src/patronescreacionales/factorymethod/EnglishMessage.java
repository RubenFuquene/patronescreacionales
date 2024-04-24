package patronescreacionales.factorymethod;

public class EnglishMessage implements Message, Cloneable {

	@Override
	public void showMessage() {
		System.out.println("Hello World from Factory Method (English)");
	}

	@Override
    public Object clone(){
        // Llamamos al método clone de la clase Object y hacemos un casting a SpanishMessage
        try {
        	return (EnglishMessage) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return null;
    }
}
