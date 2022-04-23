package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        PrintStream myStream = new PrintStream(baos);

        System.setOut(myStream);

        testString.printSomething();

        String[] arrResult = baos.toString().split(" ");

        String arithmeticalResult = "";

        switch (arrResult[1]) {
            case "+":
                arithmeticalResult = "" + (Integer.parseInt(arrResult[0]) + Integer.parseInt(arrResult[2]));
                break;
            case "-":
                arithmeticalResult = "" + (Integer.parseInt(arrResult[0]) - Integer.parseInt(arrResult[2]));
                break;
            case "*":
                arithmeticalResult = "" + (Integer.parseInt(arrResult[0]) * Integer.parseInt(arrResult[2]));
                break;
        }
        String result = baos.toString() + arithmeticalResult;
        System.setOut(consoleStream);
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

