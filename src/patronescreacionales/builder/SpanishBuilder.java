package patronescreacionales.builder;

import patronescreacionales.abstractfactory.GreetingFactory;
import patronescreacionales.abstractfactory.SpanishFactory;
import patronescreacionales.factorymethod.Message;

public class SpanishBuilder implements GreetingBuilder {

	private Message message;
	private GreetingFactory greetingFactory;
	
	@Override
	public void setMessage() {
		this.greetingFactory = new SpanishFactory();
	}

	@Override
	public Message build() {
		this.message = this.greetingFactory.createMessage();
		return this.message;
	}

}
