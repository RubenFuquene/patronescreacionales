import patronescreacionales.factorymethod.Message;
import patronescreacionales.singleton.Singleton;

public class Main
{
    public static void main(String[] args)
    {
        Message message = Singleton.getInstance("Spanish");
        message.showMessage();
        
        Message messageClon = (Message) message.clone();
        messageClon.showMessage();
    }
}