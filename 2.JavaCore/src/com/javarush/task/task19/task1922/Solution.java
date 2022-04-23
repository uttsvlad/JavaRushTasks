package com.javarush.task.task19.task1922;

import javax.annotation.processing.Filer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("А");
        words.add("Б");
        words.add("В");
    }

    public static void main(String[] args) {
        String fileName = "";
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<String> stringsFromFile = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            while (bufferedReader.ready())
                stringsFromFile.add(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int i = 0;
        for (String str : stringsFromFile) {
            i = 0;
            String[] buf = str.split(" ");
            for (String b : buf) {
                for (String word : words) {
                    if (word.equals(b))
                        i++;
                }
            }
            if (i == 2)
                System.out.println(str);
        }
    }
}
