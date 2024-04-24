package patronescreacionales.singleton;

import patronescreacionales.abstractfactory.EnglishFactory;
import patronescreacionales.abstractfactory.GreetingFactory;
import patronescreacionales.abstractfactory.SpanishFactory;
import patronescreacionales.builder.Director;
import patronescreacionales.builder.EnglishBuilder;
import patronescreacionales.builder.GreetingBuilder;
import patronescreacionales.builder.SpanishBuilder;
import patronescreacionales.factorymethod.EnglishMessage;
import patronescreacionales.factorymethod.Message;
import patronescreacionales.factorymethod.MessageFactory;
import patronescreacionales.factorymethod.SpanishMessage;

public class Singleton implements Message {
	private static Message instance;
    
    private Singleton() {}
    
    public static Message getInstance(String language) {
        if (instance == null)
        {
        	GreetingBuilder greetingBuilder;
        	
	    	if (language.equalsIgnoreCase("Spanish")) {
	    		greetingBuilder = new SpanishBuilder();
	    		Director director = new Director(greetingBuilder);
	    		instance = director.construct();
	        } else if (language.equalsIgnoreCase("English")) {
	        	greetingBuilder = new EnglishBuilder();
	        	Director director = new Director(greetingBuilder);
	        	instance = director.construct();
	        } else {
	        	instance = null;
	        }
        }
        return instance;
    }
    
    @Override
    public void showMessage() {
        System.out.println("Hola Mundo desde Singleton");
    }
    
    @Override
    public Object clone(){
        // Llamamos al método clone de la clase Object y hacemos un casting a SpanishMessage
        try {
			return (Message) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return null;
    }
}
