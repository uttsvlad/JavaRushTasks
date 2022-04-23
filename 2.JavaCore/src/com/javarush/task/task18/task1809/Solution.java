package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) {
        String path1 = null;
        String path2 = null;
        ArrayList<Integer> bytes = new ArrayList<>();
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            path1 = bf.readLine();
            path2 = bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream fis = new FileInputStream(path1);
             FileOutputStream fos = new FileOutputStream(path2)) {
            while (fis.available() > 0)
                bytes.add(fis.read());
            Collections.reverse(bytes);
            byte[] b = new byte[bytes.size()];
            int i = 0;
            for (int bs : bytes) {
                b[i] = (byte) bs;
                i++;
                fos.write(bs);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
