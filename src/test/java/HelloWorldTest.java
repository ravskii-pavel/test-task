import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    private ResourceBundle bundleEN = ResourceBundle.getBundle("message", new Locale("en", "EN"));
    private ResourceBundle bundleRU = ResourceBundle.getBundle("message", new Locale("ru", "UA"));
    private HelloWorld helloWorld = new HelloWorld(bundleEN, bundleRU);
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ENGLISH);
    private String testTimeZoneUkraine = "Europe/Kiev";
    private String testTimeZoneNewYork = "America/New_York";
    private String testTimeZoneTokyo = "Asia/Tokyo";

    @Test
    public void ShouldReturnGoodMorningMessageOnRussianFromKiev() throws ParseException {
        //given
        String expected = bundleRU.getString("message.morning");
        //when
        String actual = helloWorld.sayHello(format.parse("2017-08-11 08:48"), testTimeZoneUkraine);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void ShouldReturnGoodDayMessageOnRussianFromKiev() throws ParseException {
        //given
        String expected = bundleRU.getString("message.day");
        //when
        String actual = helloWorld.sayHello(format.parse("2017-08-11 11:15"), testTimeZoneUkraine);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void ShouldReturnGoodEveningMessageOnRussianFromKiev() throws ParseException {
        //given
        String expected = bundleRU.getString("message.evening");
        //when
        String actual = helloWorld.sayHello(format.parse("2017-08-11 21:37"), testTimeZoneUkraine);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void ShouldReturnGoodNightMessageOnRussianFromKiev() throws ParseException {
        //given
        String expected = bundleRU.getString("message.night");
        //when
        String actual = helloWorld.sayHello(format.parse("2017-08-11 03:41"), testTimeZoneUkraine);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void ShouldReturnGoodMorningMessageOnEnglishFromNY() throws ParseException {
        //given
        String expected = bundleEN.getString("message.morning");
        //when
        String actual = helloWorld.sayHello(format.parse("2017-08-11 06:55"), testTimeZoneNewYork);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void ShouldReturnGoodDayMessageOnEnglishFromNY() throws ParseException {
        //given
        String expected = bundleEN.getString("message.day");
        //when
        String actual = helloWorld.sayHello(format.parse("2017-08-11 14:55"), testTimeZoneNewYork);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void ShouldReturnGoodEveningMessageOnEnglishFromNY() throws ParseException {
        //given
        String expected = bundleEN.getString("message.evening");
        //when
        String actual = helloWorld.sayHello(format.parse("2017-08-11 20:55"), testTimeZoneNewYork);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void ShouldReturnGoodNightMessageOnEnglishFromNY() throws ParseException {
        //given
        String expected = bundleEN.getString("message.night");
        //when
        String actual = helloWorld.sayHello(format.parse("2017-08-11 02:55"), testTimeZoneNewYork);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void ShouldReturnGoodMorningMessageOnEnglishFromTokyo() throws ParseException {
        //given
        String expected = bundleEN.getString("message.morning");
        //when
        String actual = helloWorld.sayHello(format.parse("2017-08-11 06:55"), testTimeZoneTokyo);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void ShouldReturnGoodDayMessageOnEnglishFromTokyo() throws ParseException {
        //given
        String expected = bundleEN.getString("message.day");
        //when
        String actual = helloWorld.sayHello(format.parse("2017-08-11 14:55"), testTimeZoneTokyo);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void ShouldReturnGoodEveningMessageOnEnglishFromTokyo() throws ParseException {
        //given
        String expected = bundleEN.getString("message.evening");
        //when
        String actual = helloWorld.sayHello(format.parse("2017-08-11 20:55"), testTimeZoneTokyo);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void ShouldReturnGoodNightMessageOnEnglishFromTokyo() throws ParseException {
        //given
        String expected = bundleEN.getString("message.night");
        //when
        String actual = helloWorld.sayHello(format.parse("2017-08-11 02:55"), testTimeZoneTokyo);
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }
}