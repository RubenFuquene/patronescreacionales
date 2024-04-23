package patronescreacionales.singleton;

import patronescreacionales.abstractfactory.EnglishFactory;
import patronescreacionales.abstractfactory.GreetingFactory;
import patronescreacionales.abstractfactory.SpanishFactory;
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
        	GreetingFactory greetinFactory;
        	
	    	if (language.equalsIgnoreCase("Spanish")) {
	    		greetinFactory = new SpanishFactory();
	    		instance = greetinFactory.createMessage();
	        } else if (language.equalsIgnoreCase("English")) {
	        	greetinFactory = new EnglishFactory();
	        	instance = greetinFactory.createMessage();
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
}
