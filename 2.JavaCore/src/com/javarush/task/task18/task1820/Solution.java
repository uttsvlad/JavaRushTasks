package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.ArrayList;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = "";
        String file2 = "";
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            file1 = bufferedReader.readLine();
            file2 = bufferedReader.readLine();
        }
        try (FileReader fileReader = new FileReader(file1);
             FileWriter fileWriter = new FileWriter(file2);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String doublesFromFile = bufferedReader.readLine();
            String[] strings = doublesFromFile.split(" ");
            for (String s : strings) {
                fileWriter.write(Math.round(Double.parseDouble(s))+" ");
            }
        }
    }
}
