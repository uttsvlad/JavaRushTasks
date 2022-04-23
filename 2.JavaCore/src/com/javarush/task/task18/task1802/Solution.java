package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String path = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(path);
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        while (fileInputStream.available() > 0)
            integerArrayList.add(fileInputStream.read());
        fileInputStream.close();
        System.out.println(integerArrayList.stream()
                .min(Integer::compare).get());
    }
}
