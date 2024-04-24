package patronescreacionales.builder;

import patronescreacionales.abstractfactory.EnglishFactory;
import patronescreacionales.abstractfactory.GreetingFactory;
import patronescreacionales.factorymethod.Message;

public class EnglishBuilder implements GreetingBuilder {

	private Message message;
	private GreetingFactory greetingFactory;
	
	@Override
	public void setMessage() {
		this.greetingFactory = new EnglishFactory();
	}

	@Override
	public Message build() {
		this.message = this.greetingFactory.createMessage();
		return this.message;
	}

}
