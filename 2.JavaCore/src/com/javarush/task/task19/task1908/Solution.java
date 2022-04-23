package com.javarush.task.task19.task1908;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) {
        String file1 = "";
        String file2 = "";
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            file1 = bufferedReader.readLine();
            file2 = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String str = new String();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1))) {
            while (bufferedReader.ready())
                str += (char) bufferedReader.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String numbers = "";
        String[] strings = str.split(" ");
        for (String s : strings) {
            try {
                numbers += Integer.parseInt(s) + " ";
            } catch (NumberFormatException e) {
                continue;
            }
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))) {
            bufferedWriter.write(numbers);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
