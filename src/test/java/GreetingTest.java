import com.ravskiy.Greeting;
import org.junit.Test;

import java.util.*;

import static com.ravskiy.Main.getResourceBundle;
import static org.junit.Assert.assertEquals;

public class GreetingTest {

    private Locale localeUA = new Locale("ru", "UA");
    private ResourceBundle bundleEN = getResourceBundle(Locale.US);
    private ResourceBundle bundleRU = getResourceBundle(localeUA);
    private Greeting greeting = new Greeting(bundleEN, bundleRU);

    private Calendar getCalendarByHours(int hours) {
        return new GregorianCalendar(2017, Calendar.JULY, 27, hours, 20);
    }

    @Test
    public void shouldReturnGoodMorningMessageOnRussianFromKiev() {
        //given
        String expected = greeting.convertToUTFEncoding(bundleRU.getString("message.morning"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(7), localeUA);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodDayMessageOnRussianFromKiev() {
        //given
        String expected = greeting.convertToUTFEncoding(bundleRU.getString("message.day"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(14), localeUA);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodEveningMessageOnRussianFromKiev() {
        //given
        String expected = greeting.convertToUTFEncoding(bundleRU.getString("message.evening"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(20), localeUA);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodNightMessageOnRussianFromKiev() {
        //given
        String expected = greeting.convertToUTFEncoding(bundleRU.getString("message.night"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(3), localeUA);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodMorningMessageOnEnglishFromNY() {
        //given
        String expected = greeting.convertToUTFEncoding(bundleEN.getString("message.morning"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(8), Locale.US);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodDayMessageOnEnglishFromNY() {
        //given
        String expected = greeting.convertToUTFEncoding(bundleEN.getString("message.day"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(16), Locale.US);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodEveningMessageOnEnglishFromNY() {
        //given
        String expected = greeting.convertToUTFEncoding(bundleEN.getString("message.evening"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(21), Locale.US);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodNightMessageOnEnglishFromNY() {
        //given
        String expected = greeting.convertToUTFEncoding(bundleEN.getString("message.night"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(4), Locale.US);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodMorningMessageOnEnglishFromTokyo() {
        //given
        String expected = greeting.convertToUTFEncoding(bundleEN.getString("message.morning"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(6), Locale.JAPAN);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodDayMessageOnEnglishFromTokyo() {
        //given
        String expected = greeting.convertToUTFEncoding(bundleEN.getString("message.day"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(17), Locale.JAPAN);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodEveningMessageOnEnglishFromTokyo() {
        //given
        String expected = greeting.convertToUTFEncoding(bundleEN.getString("message.evening"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(22), Locale.JAPAN);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodNightMessageOnEnglishFromTokyo() {
        //given
        String expected = greeting.convertToUTFEncoding(bundleEN.getString("message.night"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(5), Locale.JAPAN);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }
}
