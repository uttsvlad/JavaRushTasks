package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]))) {
            String fromFile1 = "";
            while (bufferedReader.ready())
                fromFile1 += bufferedReader.readLine();
            String[] toFile2 = fromFile1.split(" ");

            for (String str : toFile2) {
                if (str.matches(".*[0-9].*"))
                    bufferedWriter.write(str+" ");
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
