package patronescreacionales.builder;

import patronescreacionales.factorymethod.Message;

public interface GreetingBuilder {
	void setMessage();
	Message build();
}
