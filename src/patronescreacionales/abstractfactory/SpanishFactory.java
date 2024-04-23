package patronescreacionales.abstractfactory;

import patronescreacionales.factorymethod.Message;
import patronescreacionales.factorymethod.SpanishMessage;

public class SpanishFactory implements GreetingFactory {

	@Override
	public Message createMessage() {
		// TODO Auto-generated method stub
		return new SpanishMessage();
	}

}
