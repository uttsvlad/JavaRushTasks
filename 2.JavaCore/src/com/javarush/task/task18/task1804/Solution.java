package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(bf.readLine());
        bf.close();

        byte[] bytes = new byte[256];
        while (fis.available() > 0)
            bytes[fis.read()] += 1;
        fis.close();

        int min = Integer.MAX_VALUE;

        for (byte b : bytes) {
            if (b > 0 && b < min)
                min = b;
        }
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == min)
                System.out.print(i + " ");
        }
    }
}
