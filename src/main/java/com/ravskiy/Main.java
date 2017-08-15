package com.ravskiy;

import org.apache.log4j.Logger;

import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static final Logger APP_LOGGER = Logger.getLogger("application");

    public static void main(String[] args) {
        ResourceBundle bundleEN = getResourceBundle("en", "EN");
        ResourceBundle bundleRU = getResourceBundle("ru", "UA");
        Greeting greeting = new Greeting(bundleEN, bundleRU);
        APP_LOGGER.info(greeting.sayHello(Calendar.getInstance()));
    }

    public static ResourceBundle getResourceBundle(String language, String country) {
        return ResourceBundle.getBundle("message", new Locale(language, country));
    }
}