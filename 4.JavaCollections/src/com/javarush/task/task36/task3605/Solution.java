package com.javarush.task.task36.task3605;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.TreeSet;

/* 
Использование TreeSet
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);

        TreeSet<Character> treeSet = new TreeSet<>();

        try (FileReader fileReader = new FileReader(file)) {
            while (fileReader.ready()) {
                Character c = (char) fileReader.read();
                if (c.toString().matches("[a-zA-z]")) {
                    treeSet.add(c.toString().toLowerCase(Locale.ROOT).toCharArray()[0]);
                }
            }
        }


        int count = 0;
        for (Character c : treeSet) {
            System.out.print(c);
            count++;
            if (count == 5) {
                break;
            }
        }
    }
}
