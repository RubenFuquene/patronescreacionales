package patronescreacionales.factorymethod;

public class SpanishMessage implements Message, Cloneable  {

	@Override
	public void showMessage() {
		System.out.println("Hola Mundo desde Factory Method (Español)");
	}
	
	@Override
    public Object clone(){
        // Llamamos al método clone de la clase Object y hacemos un casting a SpanishMessage
        try {
        	return (SpanishMessage) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return null;
    }
}
