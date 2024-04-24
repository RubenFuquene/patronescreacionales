package patronescreacionales.builder;

import patronescreacionales.factorymethod.Message;

public class Director {

	private GreetingBuilder builder;
	
	public Director(GreetingBuilder builder) {
		this.builder = builder;
	}
	
	public Message construct() {
		builder.setMessage();
		return builder.build();
	}
}
