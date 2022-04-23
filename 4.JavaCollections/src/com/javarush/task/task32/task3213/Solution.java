package com.javarush.task.task32.task3213;

import java.io.IOException;
import java.io.StringReader;

/* 
Шифр Цезаря
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String stringForCoding = code("Я тебя люблю)", -29);
        System.out.println(stringForCoding);

        StringReader reader = new StringReader(stringForCoding);

        System.out.println(decode(reader, -29));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {
        int ch;
        StringBuilder sb = new StringBuilder();
        if (reader != null) {
            while ((ch = reader.read()) != -1) {
                char ch1 = (char) ch;
                sb.append((char) (ch1 + key));
            }
        }
        return sb.toString();
    }

    public static String code(String s, int key) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append((char) (c - key));
        }
        return sb.toString();
    }
}
