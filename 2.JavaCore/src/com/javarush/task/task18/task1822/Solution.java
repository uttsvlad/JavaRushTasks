package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = "";
        int id = Integer.parseInt(args[0]);
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = bufferedReader.readLine();
        }
        ArrayList<String> strings = new ArrayList<>();
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while (bufferedReader.ready())
                strings.add(bufferedReader.readLine());
        }
        for (String s : strings) {
            String forId = s.split(" ")[0];
            if (id == Integer.parseInt(forId)){
                System.out.println(s);
            }
        }
    }
}
