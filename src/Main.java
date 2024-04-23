import patronescreacionales.factorymethod.Message;
import patronescreacionales.singleton.Singleton;

public class Main
{
    public static void main(String[] args)
    {
        Message message = Singleton.getInstance("English");
        message.showMessage();
    }
}