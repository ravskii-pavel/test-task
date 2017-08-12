import org.apache.log4j.Logger;
import java.util.Calendar;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Created by ravskiy on 11.08.17.
 */
public class Main {
    public static void main(String[] args){
        Logger LOGGER = Logger.getLogger(Main.class);
        Calendar calendar = Calendar.getInstance();
        try {
            ResourceBundle bundleEN = ResourceBundle.getBundle("message", new Locale("en", "EN"));
            ResourceBundle bundleRU = ResourceBundle.getBundle("message", new Locale("ru", "UA"));
            HelloWorld helloWorld = new HelloWorld(bundleEN, bundleRU);
            System.out.println(helloWorld.sayHello(calendar.getTime(), calendar.getTimeZone().getID()));
        }catch (MissingResourceException ex){
            LOGGER.error(ex);
        }
    }
}