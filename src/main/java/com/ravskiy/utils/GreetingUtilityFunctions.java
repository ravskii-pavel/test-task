package com.ravskiy.utils;

import java.io.UnsupportedEncodingException;

public class GreetingUtilityFunctions {
    public static String convertToUTFEncoding(String message){
        try {
            return new String(message.getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return message;
        }
    }
}
