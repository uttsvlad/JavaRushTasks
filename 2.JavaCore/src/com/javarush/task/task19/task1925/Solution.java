package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) {
        String file1Name = args[0];
        String file2Name = args[1];
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1Name));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2Name))) {
            String buf = "";
            String toWrite = "";
            while (bufferedReader.ready())
                buf += " "+ bufferedReader.readLine();
            String[] strings = buf.split(" ");
            for (String str : strings) {
                if (str.length() > 6)
                    toWrite += (str + " ");
            }
            toWrite = toWrite.trim().replaceAll(" ", ",");
            bufferedWriter.write(toWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
