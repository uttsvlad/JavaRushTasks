package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
ASCII 44
*/

public class Solution {
    public static void main(String[] args) {
        String path = null;
        byte[] bytes = new byte[1000];
        int count = 0;
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            path = bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream fis = new FileInputStream(path)) {
            while (fis.available() > 0)
                fis.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (byte b : bytes) {
            if (b == 44)
                count++;
        }
        System.out.println(count);
    }
}
