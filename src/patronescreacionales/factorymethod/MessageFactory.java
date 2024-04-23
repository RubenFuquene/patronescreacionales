package patronescreacionales.factorymethod;

public class MessageFactory {
	public static Message createMessage(String language) {
        if (language.equalsIgnoreCase("Spanish")) {
            return new SpanishMessage();
        } else if (language.equalsIgnoreCase("English")) {
            return new EnglishMessage();
        } else {
            return null;
        }
    }
}
