package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
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

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))) {
            while (bufferedReader.ready()) {
                char c = (char) bufferedReader.read();
                if (c == '.')
                    bufferedWriter.write('!');
                else
                    bufferedWriter.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
