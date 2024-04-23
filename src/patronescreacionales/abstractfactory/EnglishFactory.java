package patronescreacionales.abstractfactory;

import patronescreacionales.factorymethod.EnglishMessage;
import patronescreacionales.factorymethod.Message;

public class EnglishFactory implements GreetingFactory {

	@Override
	public Message createMessage() {
		// TODO Auto-generated method stub
		return new EnglishMessage();
	}

}
