package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) {
        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];

        try (RandomAccessFile raf = new RandomAccessFile(fileName, "r")) {
            raf.seek(number);

            byte[] b = new byte[text.length()];
            raf.read(b, 0, text.length());

            String textFromFile = new String(b);

            raf.seek(raf.length());
            if (text.equals(textFromFile))
                raf.write("true".getBytes(StandardCharsets.UTF_8));
            else
                raf.write("false".getBytes(StandardCharsets.UTF_8));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
