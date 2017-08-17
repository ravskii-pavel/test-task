/*
import com.ravskiy.Greeting;
import org.junit.Test;

import java.util.*;

import static com.ravskiy.Main.getResourceBundle;
import static org.junit.Assert.assertEquals;

public class GreetingTest {

    private ResourceBundle bundleEN = getResourceBundle("en", "EN");
    private ResourceBundle bundleRU = getResourceBundle("ru", "UA");
    private Greeting greeting = new Greeting(bundleEN, bundleRU);
    private String testTimeZoneUkraine = "Europe/Kiev";
    private String testTimeZoneNewYork = "America/New_York";
    private String testTimeZoneTokyo = "Asia/Tokyo";

    private Calendar getCalendarByLocale(int hours, Locale locale) {
        Calendar calendar = Calendar.getInstance(locale);
        calendar.getTimeZone().getDisplayName(locale);
        //Calendar calendar = new GregorianCalendar(2017, Calendar.JULY, 27, hours, 20);
        //calendar.get()
        return calendar;
    }

    private Calendar getCalendarByTimeZone(int hours, String timeZoneName) {
        Calendar calendar = new GregorianCalendar(2017, Calendar.JULY, 27, hours, 20);
        calendar.setTimeZone(TimeZone.getTimeZone(timeZoneName));
        return calendar;
    }

    @Test
    public void shouldReturnGoodMorningMessageOnRussianFromKiev() {
        //given
        String expected = bundleRU.getString("message.morning");
        //when
        String actual = greeting.sayHello(getCalendarByTimeZone(7, testTimeZoneUkraine));
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodDayMessageOnRussianFromKiev() {
        //given
        String expected = bundleRU.getString("message.day");
        //when
        String actual = greeting.sayHello(getCalendarByTimeZone(14, testTimeZoneUkraine));
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodEveningMessageOnRussianFromKiev() {
        //given
        String expected = bundleRU.getString("message.evening");
        //when
        String actual = greeting.sayHello(getCalendarByTimeZone(20, testTimeZoneUkraine));
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodNightMessageOnRussianFromKiev() {
        //given
        String expected = bundleRU.getString("message.night");
        //when
        String actual = greeting.sayHello(getCalendarByTimeZone(3, testTimeZoneUkraine));
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodMorningMessageOnEnglishFromNY() {
        //given
        String expected = bundleEN.getString("message.morning");
        //when
        String actual = greeting.sayHello(getCalendarByTimeZone(8, testTimeZoneNewYork));
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodDayMessageOnEnglishFromNY() {
        //given
        String expected = bundleEN.getString("message.day");
        //when
        String actual = greeting.sayHello(getCalendarByTimeZone(16, testTimeZoneNewYork));
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodEveningMessageOnEnglishFromNY() {
        //given
        String expected = bundleEN.getString("message.evening");
        //when
        String actual = greeting.sayHello(getCalendarByTimeZone(21, testTimeZoneNewYork));
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodNightMessageOnEnglishFromNY() {
        //given
        String expected = bundleEN.getString("message.night");
        //when
        String actual = greeting.sayHello(getCalendarByTimeZone(4, testTimeZoneNewYork));
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodMorningMessageOnEnglishFromTokyo() {
        //given
        String expected = bundleEN.getString("message.morning");
        //when
        String actual = greeting.sayHello(getCalendarByTimeZone(6, testTimeZoneTokyo));
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodDayMessageOnEnglishFromTokyo() {
        //given
        String expected = bundleEN.getString("message.day");
        //when
        String actual = greeting.sayHello(getCalendarByTimeZone(17, testTimeZoneTokyo));
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodEveningMessageOnEnglishFromTokyo() {
        //given
        String expected = bundleEN.getString("message.evening");
        //when
        String actual = greeting.sayHello(getCalendarByTimeZone(22, testTimeZoneTokyo));
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodNightMessageOnEnglishFromTokyo() {
        //given
        String expected = bundleEN.getString("message.night");
        //when
        String actual = greeting.sayHello(getCalendarByTimeZone(5, testTimeZoneTokyo));
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }
}*/
