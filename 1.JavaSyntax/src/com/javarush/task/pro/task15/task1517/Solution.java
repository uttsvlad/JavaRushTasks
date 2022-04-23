package com.javarush.task.pro.task15.task1517;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файловые операции
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("C:\\Games");
        try (DirectoryStream<Path> files = Files.newDirectoryStream(filePath)){
            files.forEach(path -> System.out.println(path.toString()));
        }
    }
}

