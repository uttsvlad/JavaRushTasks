package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
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

        String toFile = "";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))) {
            while (bufferedReader.ready()) {
                toFile += (char) bufferedReader.read();
            }
            toFile = toFile.replaceAll("\\p{P}", "");
            bufferedWriter.write(toFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
