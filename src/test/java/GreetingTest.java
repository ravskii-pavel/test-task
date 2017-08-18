import com.ravskiy.Greeting;
import org.junit.Test;

import java.util.*;

import static com.ravskiy.Main.getResourceBundle;
import static com.ravskiy.utils.GreetingUtilityFunctions.convertToUTFEncoding;
import static org.junit.Assert.assertEquals;

public class GreetingTest {

    private Locale localeUA = new Locale("ru", "UA");
    private ResourceBundle bundleEN = getResourceBundle(Locale.US);
    private ResourceBundle bundleRU = getResourceBundle(localeUA);

    private Calendar getCalendarByHours(int hours) {
        return new GregorianCalendar(2017, Calendar.JULY, 27, hours, 20);
    }

    @Test
    public void shouldReturnGoodMorningMessageOnRussianFromKiev() {
        //given
        Greeting greeting = new Greeting(bundleEN, bundleRU);
        String expected = convertToUTFEncoding(bundleRU.getString("message.morning"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(7), localeUA);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodDayMessageOnRussianFromKiev() {
        //given
        Greeting greeting = new Greeting(bundleEN, bundleRU);
        String expected = convertToUTFEncoding(bundleRU.getString("message.day"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(14), localeUA);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodEveningMessageOnRussianFromKiev() {
        //given
        Greeting greeting = new Greeting(bundleEN, bundleRU);
        String expected = convertToUTFEncoding(bundleRU.getString("message.evening"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(20), localeUA);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodNightMessageOnRussianFromKiev() {
        //given
        Greeting greeting = new Greeting(bundleEN, bundleRU);
        String expected = convertToUTFEncoding(bundleRU.getString("message.night"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(3), localeUA);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodMorningMessageOnEnglishFromNY() {
        //given
        Greeting greeting = new Greeting(bundleEN, bundleRU);
        String expected = convertToUTFEncoding(bundleEN.getString("message.morning"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(8), Locale.US);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodDayMessageOnEnglishFromNY() {
        //given
        Greeting greeting = new Greeting(bundleEN, bundleRU);
        String expected = convertToUTFEncoding(bundleEN.getString("message.day"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(16), Locale.US);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodEveningMessageOnEnglishFromNY() {
        //given
        Greeting greeting = new Greeting(bundleEN, bundleRU);
        String expected = convertToUTFEncoding(bundleEN.getString("message.evening"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(21), Locale.US);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodNightMessageOnEnglishFromNY() {
        //given
        Greeting greeting = new Greeting(bundleEN, bundleRU);
        String expected = convertToUTFEncoding(bundleEN.getString("message.night"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(4), Locale.US);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodMorningMessageOnEnglishFromTokyo() {
        //given
        Greeting greeting = new Greeting(bundleEN, bundleRU);
        String expected = convertToUTFEncoding(bundleEN.getString("message.morning"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(6), Locale.JAPAN);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodDayMessageOnEnglishFromTokyo() {
        //given
        Greeting greeting = new Greeting(bundleEN, bundleRU);
        String expected = convertToUTFEncoding(bundleEN.getString("message.day"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(17), Locale.JAPAN);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodEveningMessageOnEnglishFromTokyo() {
        //given
        Greeting greeting = new Greeting(bundleEN, bundleRU);
        String expected = convertToUTFEncoding(bundleEN.getString("message.evening"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(22), Locale.JAPAN);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void shouldReturnGoodNightMessageOnEnglishFromTokyo() {
        //given
        Greeting greeting = new Greeting(bundleEN, bundleRU);
        String expected = convertToUTFEncoding(bundleEN.getString("message.night"));
        //when
        String actual = greeting.sayHello(getCalendarByHours(5), Locale.JAPAN);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }
}
