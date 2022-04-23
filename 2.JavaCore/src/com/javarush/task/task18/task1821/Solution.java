package com.javarush.task.task18.task1821;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] ascii = new int[128];
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                ascii[fileReader.read()]++;
            }
        }
        for (int i = 0; i < ascii.length; i++) {
            if (ascii[i] != 0)
                System.out.println((char) i + " " + ascii[i]);
        }
    }
}
