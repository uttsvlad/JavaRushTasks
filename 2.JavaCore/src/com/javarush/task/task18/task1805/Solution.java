package com.javarush.task.task18.task1805;

import java.io.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) {
        String path = null;
        ArrayList<Integer> bytes = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            path = bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream(path)) {
            while (fis.available() > 0)
                bytes.add(fis.read());
        } catch (IOException e) {
            e.printStackTrace();

        }
        ArrayList<Integer> result = (ArrayList<Integer>) bytes.stream().distinct().sorted().collect(Collectors.toList());
        for (int itog : result) {
            System.out.print(itog+" ");
        }
    }
}
