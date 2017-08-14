import com.ravskiy.Greeting;
import org.junit.Test;
import java.text.ParseException;
import java.util.*;
import static com.ravskiy.Main.getResourceBundle;
import static org.junit.Assert.assertEquals;

public class GreetingTest {

    private ResourceBundle bundleEN = getResourceBundle("en", "EN");
    private ResourceBundle bundleRU = getResourceBundle("ru", "UA");
    private Greeting greeting = new Greeting(bundleEN, bundleRU);
    private Calendar calendar = new GregorianCalendar(2017, Calendar.JULY, 27, 14, 20);
    private String testTimeZoneUkraine = "Europe/Kiev";
    private String testTimeZoneNewYork = "America/New_York";
    private String testTimeZoneTokyo = "Asia/Tokyo";

    @Test
    public void shouldReturnGoodMorningMessageOnRussianFromKiev() throws ParseException {
        //given
        calendar.set(Calendar.HOUR_OF_DAY, 7);
        calendar.setTimeZone(TimeZone.getTimeZone(testTimeZoneUkraine));
        String expected = bundleRU.getString("message.morning");
        //when
        String actual = greeting.sayHello(calendar);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodDayMessageOnRussianFromKiev() throws ParseException {
        //given
        calendar.set(Calendar.HOUR_OF_DAY, 14);
        calendar.setTimeZone(TimeZone.getTimeZone(testTimeZoneUkraine));
        String expected = bundleRU.getString("message.day");
        //when
        String actual = greeting.sayHello(calendar);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodEveningMessageOnRussianFromKiev() throws ParseException {
        //given
        calendar.set(Calendar.HOUR_OF_DAY, 20);
        calendar.setTimeZone(TimeZone.getTimeZone(testTimeZoneUkraine));
        String expected = bundleRU.getString("message.evening");
        //when
        String actual = greeting.sayHello(calendar);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodNightMessageOnRussianFromKiev() throws ParseException {
        //given
        calendar.set(Calendar.HOUR_OF_DAY, 3);
        calendar.setTimeZone(TimeZone.getTimeZone(testTimeZoneUkraine));
        String expected = bundleRU.getString("message.night");
        //when
        String actual = greeting.sayHello(calendar);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodMorningMessageOnEnglishFromNY() throws ParseException {
        //given
        calendar.set(Calendar.HOUR_OF_DAY, 8);
        calendar.setTimeZone(TimeZone.getTimeZone(testTimeZoneNewYork));
        String expected = bundleEN.getString("message.morning");
        //when
        String actual = greeting.sayHello(calendar);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodDayMessageOnEnglishFromNY() throws ParseException {
        //given
        calendar.set(Calendar.HOUR_OF_DAY, 16);
        calendar.setTimeZone(TimeZone.getTimeZone(testTimeZoneNewYork));
        String expected = bundleEN.getString("message.day");
        //when
        String actual = greeting.sayHello(calendar);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodEveningMessageOnEnglishFromNY() throws ParseException {
        //given
        calendar.set(Calendar.HOUR_OF_DAY, 21);
        calendar.setTimeZone(TimeZone.getTimeZone(testTimeZoneNewYork));
        String expected = bundleEN.getString("message.evening");
        //when
        String actual = greeting.sayHello(calendar);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodNightMessageOnEnglishFromNY() throws ParseException {
        //given
        calendar.set(Calendar.HOUR_OF_DAY, 4);
        calendar.setTimeZone(TimeZone.getTimeZone(testTimeZoneNewYork));
        String expected = bundleEN.getString("message.night");
        //when
        String actual = greeting.sayHello(calendar);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodMorningMessageOnEnglishFromTokyo() throws ParseException {
        //given
        calendar.set(Calendar.HOUR_OF_DAY, 6);
        calendar.setTimeZone(TimeZone.getTimeZone(testTimeZoneTokyo));
        String expected = bundleEN.getString("message.morning");
        //when
        String actual = greeting.sayHello(calendar);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodDayMessageOnEnglishFromTokyo() throws ParseException {
        //given
        calendar.set(Calendar.HOUR_OF_DAY, 17);
        calendar.setTimeZone(TimeZone.getTimeZone(testTimeZoneTokyo));
        String expected = bundleEN.getString("message.day");
        //when
        String actual = greeting.sayHello(calendar);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodEveningMessageOnEnglishFromTokyo() throws ParseException {
        //given
        calendar.set(Calendar.HOUR_OF_DAY, 22);
        calendar.setTimeZone(TimeZone.getTimeZone(testTimeZoneTokyo));
        String expected = bundleEN.getString("message.evening");
        //when
        String actual = greeting.sayHello(calendar);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodNightMessageOnEnglishFromTokyo() throws ParseException {
        //given
        calendar.set(Calendar.HOUR_OF_DAY, 5);
        calendar.setTimeZone(TimeZone.getTimeZone(testTimeZoneTokyo));
        String expected = bundleEN.getString("message.night");
        //when
        String actual = greeting.sayHello(calendar);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }
}