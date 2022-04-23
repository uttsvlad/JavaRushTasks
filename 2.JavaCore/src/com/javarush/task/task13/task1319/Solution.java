package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(scanner.nextLine()));
        ArrayList<String> strings = new ArrayList<>();
        String s = "";
        while (!s.equals("exit")) {
            s = scanner.nextLine();
            strings.add(s);
        }
        for (String str : strings) {
            bufferedWriter.write(str + "\n");
        }
        bufferedWriter.close();
    }
}
