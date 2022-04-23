package com.javarush.task.pro.task15.task1504;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = new String(scanner.nextLine());
        String output = new String(scanner.nextLine());
        try (InputStream inputStream = Files.newInputStream(Paths.get(input));
             OutputStream outputStream = Files.newOutputStream(Paths.get(output))) {
            byte[] buffer = inputStream.readAllBytes();
            for (int i = 0; i < buffer.length - 1; i += 2) {
                byte buf = buffer[i + 1];
                buffer[i + 1] = buffer[i];
                buffer[i] = buf;
            }
            outputStream.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

