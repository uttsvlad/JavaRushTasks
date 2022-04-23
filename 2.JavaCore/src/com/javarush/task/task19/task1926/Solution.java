package com.javarush.task.task19.task1926;

import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) {
        StringBuilder stringBuilder;
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedReader fileReader = new BufferedReader(new FileReader(consoleReader.readLine()))) {
                while (fileReader.ready()){
                    stringBuilder = new StringBuilder(fileReader.readLine());
                    System.out.println(stringBuilder.reverse().toString());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
