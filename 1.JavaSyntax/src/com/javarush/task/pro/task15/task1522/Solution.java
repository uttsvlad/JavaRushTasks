package com.javarush.task.pro.task15.task1522;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://google.com");
        InputStream inputStream = url.openStream();
        byte[] buf = inputStream.readAllBytes();
        String s = new String(buf);
        System.out.println(s);
    }
}