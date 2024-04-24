package patronescreacionales.factorymethod;

public interface Message extends Cloneable {
	void showMessage();
	
	Object clone();
}
