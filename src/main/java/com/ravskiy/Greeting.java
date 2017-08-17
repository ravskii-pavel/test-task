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

    public String sayHello(Calendar calendar, Locale locale) {
        //String timeZoneName = calendar.getTimeZone().getID();
        String localeName = locale.getLanguage();
        if (localeName.equals("ru")) return getMessage(calendar, bundleRU);
        else return getMessage(calendar, bundleEN);
    }

    private String getMessage(Calendar calendar, ResourceBundle bundle) {
        String message;
//        String timeZoneName = bundle.getLocale().getCountry();
        String localeTime = String.format("%s:%s", calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
        int currentHours = calendar.get(Calendar.HOUR_OF_DAY);
        if (currentHours >= 9 && currentHours < 19) message = bundle.getString("message.day");
        else if (currentHours < 6 || currentHours == 23) message = bundle.getString("message.night");
        else if (currentHours >= 19 && currentHours < 23) message = bundle.getString("message.evening");
        else message = bundle.getString("message.morning");
        SYSTEM_LOGGER.info(String.format("Language: %s; Local time: %s; Message: %s",
                bundle.getLocale(), localeTime, message));
        return message;
    }
}