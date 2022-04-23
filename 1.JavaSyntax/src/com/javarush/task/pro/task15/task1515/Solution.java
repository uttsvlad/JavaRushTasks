package com.javarush.task.pro.task15.task1515;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Абсолютный путь
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path path = Path.of(str);
        if (!path.isAbsolute())
            path = path.toAbsolutePath();
        System.out.println(path);
    }
}

