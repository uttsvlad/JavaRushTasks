package com.javarush.task.task14.task1421;

/* 
Singleton
*/

public class Solution {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
    }
}
