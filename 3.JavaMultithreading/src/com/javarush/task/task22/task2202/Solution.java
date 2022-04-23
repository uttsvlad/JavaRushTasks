package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        if (string==null)
            throw new TooShortStringException();
        String buf = new String();
        String[] splittedString = string.split(" ");
        if (splittedString.length < 5)
            throw new TooShortStringException();
        for (int i = 1; i < 5; i++) {
            buf += splittedString[i] + " ";

        }
        return buf.trim();
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
