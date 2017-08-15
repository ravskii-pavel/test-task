package com.ravskiy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.log4j.Logger;

import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Greeting {
    public static final Logger SYSTEM_LOGGER = Logger.getLogger(Greeting.class);
    private ResourceBundle bundleEN;
    private ResourceBundle bundleRU;

    public String sayHello(Calendar calendar) {
        String timeZoneName = calendar.getTimeZone().getID();
        if (timeZoneName.equals("Europe/Kiev")) return getMessage(calendar, bundleRU, timeZoneName);
        else return getMessage(calendar, bundleEN, timeZoneName);
    }

    private String getMessage(Calendar calendar, ResourceBundle bundle, String timeZoneName) {
        String message;
        String localeTime = String.format("%s:%s", calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
        int currentHours = calendar.get(Calendar.HOUR_OF_DAY);
        if (currentHours >= 9 && currentHours < 19) message = bundle.getString("message.day");
        else if (currentHours < 6 || currentHours == 23) message = bundle.getString("message.night");
        else if (currentHours >= 19 && currentHours < 23) message = bundle.getString("message.evening");
        else message = bundle.getString("message.morning");
        SYSTEM_LOGGER.info(String.format("TimeZone: %s; Language: %s; Local time: %s; Message: %s",
                timeZoneName, bundle.getLocale(), localeTime, message));
        return message;
    }
}