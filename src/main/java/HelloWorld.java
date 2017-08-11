/**
 * Created by ravskiy on 11.08.17.
 */
import lombok.Getter;
import lombok.Setter;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.Calendar;
import java.util.Properties;

@Getter
@Setter
public class HelloWorld {

    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class);
    private Calendar calendar = Calendar.getInstance();
    private String propertyFileName;

    void greetingMessage(){ System.out.println(sayHello()); }
    String sayHello() {

        String timeZoneName = getCurrentNameTimeZone();
        int currentHours = getCurrentHoursOfTime();

        if (timeZoneName.equals("Europe/Kiev")) propertyFileName = "message.ru.properties";
        else propertyFileName = "message.en.properties";
        Properties property = loadPropertyFile(propertyFileName);

        if (currentHours >= 9 && currentHours < 19) return property.getProperty("prop.day");
        else if (currentHours < 6 || currentHours == 23) return property.getProperty("prop.night");
        else if (currentHours >= 19 && currentHours < 23) return property.getProperty("prop.evening");
        else return property.getProperty("prop.morning");
    }

    private int getCurrentHoursOfTime() {
        return calendar.get(Calendar.HOUR_OF_DAY);
    }
    private String getCurrentNameTimeZone() {
        return calendar.getTimeZone().getID();
    }
    private Properties loadPropertyFile(String propertyFileName) {

        Properties property = new Properties();
        try {
            InputStream fis = ClassLoader.getSystemResourceAsStream(propertyFileName);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            property.load(isr);
            isr.close();
        } catch (IOException e) {
            LOGGER.error(e);
        }
        return property;
    }
}
