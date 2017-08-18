package com.ravskiy;

import org.apache.log4j.Logger;

import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static final Logger APP_LOGGER = Logger.getLogger("application");

    public static void main(String[] args) {
        ResourceBundle bundleEN = getResourceBundle(Locale.US);
        ResourceBundle bundleRU = getResourceBundle(new Locale("ru", "UA"));
        Greeting greeting = new Greeting(bundleEN, bundleRU);
        APP_LOGGER.info(greeting.sayHello(Calendar.getInstance(), Locale.getDefault()));
    }

    public static ResourceBundle getResourceBundle(Locale locale) {
        return ResourceBundle.getBundle("message", locale);
    }
}