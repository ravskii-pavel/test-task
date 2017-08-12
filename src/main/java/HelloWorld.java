import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.log4j.Logger;
import java.text.SimpleDateFormat;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HelloWorld {
    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class);
    private ResourceBundle bundleEN;
    private ResourceBundle bundleRU;

    String sayHello(Date date, String timeZoneName) {
        int currentHours = Integer.parseInt(new SimpleDateFormat("HH").format(date));
        if (timeZoneName.equals("Europe/Kiev")) return getMessage(currentHours, bundleRU, timeZoneName);
        else return getMessage(currentHours, bundleEN, timeZoneName);
    }
    private String getMessage(int currentHours, ResourceBundle bundle, String timeZoneName){
        String message;
        if (currentHours >= 9 && currentHours < 19) message = bundle.getString("message.day");
        else if (currentHours < 6 || currentHours == 23) message = bundle.getString("message.night");
        else if (currentHours >= 19 && currentHours < 23) message = bundle.getString("message.evening");
        else message = bundle.getString("message.morning");
        LOGGER.info("TimeZone: " + timeZoneName + "; " + "Language: " + bundle.getLocale() + "; " +
                    "Message: " + message + ".");
        return message;
    }
}