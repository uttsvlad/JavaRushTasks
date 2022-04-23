package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String[] strings = url.split("\\?");
        strings = strings[strings.length - 1].split("\\&");
        String obj = "";
        for (String str : strings) {
            if (str.contains("=")) {
                String[] strings1 = str.split("=");
                if (strings1[0].contains("obj"))
                    obj = strings1[1];
                System.out.print(strings1[0] + " ");
            } else
                System.out.print(str + " ");
        }
        System.out.println();
        if (!obj.equals("")) {
            try {
                alert(Double.parseDouble(obj));
            } catch (NumberFormatException e) {
                alert(obj);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
