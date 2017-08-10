import org.apache.log4j.Logger;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.TimeZone;

public class HelloWorld {

    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class);
    private FileInputStream fis;
    private Properties property = new Properties();

    void sayHello() {
        String messageProp;
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        String timeZoneName =  timeZone.getID();
        System.out.println(timeZone.getID());
        Calendar calendar = Calendar.getInstance();
//        String propFileName = "message.resource.properties";
//        String now = calendar.getTime().toString();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        /*InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);*/
        if (timeZoneName.equals("Europe/Kiev")) messageProp = "message.ru.properties";
        else messageProp = "message.en.properties";
        try {
            fis = new FileInputStream("src/main/resources/localizations/"+messageProp);
//            BufferedReader is = new BufferedReader(new InputStreamReader(fis, "Cp1251"));
//            BufferedReader bufReader = new BufferedReader(new InputStreamReader(new FileInputStream(String.valueOf(fis)), Charset.forName("UTF-8")));


            //FileInputStream fis1 = new FileInputStream("priwet.txt");
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            Reader in = new BufferedReader(isr);

            property.load(in);
            in.close();
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
            LOGGER.error("ОШИБКА: Файл свойств отсуствует!");
        }
    }
}
