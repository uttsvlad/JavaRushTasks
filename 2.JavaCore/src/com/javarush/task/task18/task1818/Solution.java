package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) {
        String file1 = null;
        String file2 = null;
        String file3 = null;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            file1 = bufferedReader.readLine();
            file2 = bufferedReader.readLine();
            file3 = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter file1Writer = new FileWriter(file1);
             FileReader file2Reader = new FileReader(file2);
             FileReader file3Reader = new FileReader(file3)) {
            while (file2Reader.ready())
                file1Writer.write(file2Reader.read());
            while (file3Reader.ready())
                file1Writer.write(file3Reader.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
