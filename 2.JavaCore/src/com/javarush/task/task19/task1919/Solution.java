package com.javarush.task.task19.task1919;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> fromFile = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {
            while (bufferedReader.ready()) {
                String s = bufferedReader.readLine();
                fromFile.add(s);
                name.add(s.split(" ")[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        name = (ArrayList<String>) name.stream().distinct().collect(Collectors.toList());


        HashMap<String, Double> map = new HashMap<>();
        for (String stringFromFile : fromFile) {
            if (map.containsKey(stringFromFile.split(" ")[0])) {
                map.put(stringFromFile.split(" ")[0], (map.get(stringFromFile.split(" ")[0]) + Double.parseDouble(stringFromFile.split(" ")[1])));
            } else {
                map.put(stringFromFile.split(" ")[0], Double.parseDouble(stringFromFile.split(" ")[1]));
            }
        }
        SortedSet<String> keys = new TreeSet<>(map.keySet());
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
    }
}