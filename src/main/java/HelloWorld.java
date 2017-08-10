import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.TimeZone;

public class HelloWorld {

    private FileInputStream fis;
    private Properties property = new Properties();


    public void sayHello() {
        //String timesOfDay;
        //TimeZone timeZone = Calendar.getInstance().getTimeZone();
        Calendar calendar = Calendar.getInstance();
        String propFileName = "message.resource.properties";
        String now = calendar.getTime().toString();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

        try {
            fis = new FileInputStream("src/main/resources/message.resource1.properties");
            property.load(fis);
            if (hour >= 9 && hour < 19) {
                System.out.println(property.getProperty("prop.day"));
            }
            else if (hour < 6 || hour == 23) {
                System.out.println(property.getProperty("prop.night"));
            }
            else if(hour >= 19 && hour < 23) {
                System.out.println(property.getProperty("prop.evening"));
            }
            else {
                System.out.println(property.getProperty("prop.morning"));
            }

        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
    }
}
