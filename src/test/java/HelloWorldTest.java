import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    private HelloWorld helloWorld = new HelloWorld();

    @Test
    public void ShouldReturnGoodMorningMessageOnRussian(){
        //given
        String expected = "Доброе утро, Мир!";
        helloWorld.getCalendar().getTimeZone().setID("Europe/Kiev");
        helloWorld.getCalendar().set(Calendar.HOUR_OF_DAY, 8);
        //when
        String actual = helloWorld.sayHello();
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

    @Test
    public void ShouldReturnGoodMorningMessageOnEnglish(){
        //given
        String expected = "Good morning, World!";
        helloWorld.getCalendar().getTimeZone().setID("America/New_York");
        helloWorld.getCalendar().set(Calendar.HOUR_OF_DAY, 8);
        //when
        String actual = helloWorld.sayHello();
        //then
        assertEquals("Wrong actual Message. Expected: " + expected, expected, actual);
    }

}