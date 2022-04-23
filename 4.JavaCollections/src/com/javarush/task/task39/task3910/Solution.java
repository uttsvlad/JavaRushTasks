package com.javarush.task.task39.task3910;

/* 
isPowerOfThree
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static boolean isPowerOfThree(int n) {
        int buf = 1;
        for (; buf < n; ) {
            buf *= 3;
        }
        if (buf == n)
            return true;
        if (n == 1) {
            return true;
        }
        return false;
    }
}
