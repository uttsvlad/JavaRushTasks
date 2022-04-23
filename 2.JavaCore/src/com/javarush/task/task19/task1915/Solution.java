package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        String fileName = "";
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        PrintStream baosStream = new PrintStream(baos);

        System.setOut(baosStream);

        testString.printSomething();

        String result = baos.toString();

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(baos.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.setOut(consoleStream);
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

