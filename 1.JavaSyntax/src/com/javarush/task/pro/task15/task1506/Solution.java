package com.javarush.task.pro.task15.task1506;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            lines.forEach(s -> {
                char[] chars = s.toCharArray();
                for (char charec : chars) {
                    if (charec != ',' && charec != '.' && charec != ' ')
                        System.out.print(charec);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

