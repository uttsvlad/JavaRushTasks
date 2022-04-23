package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(2.2,"sd");
        labels.put(2.3,"sы");
        labels.put(2.4,"sр");
        labels.put(2.5,"sп");
        labels.put(2.6,"sм");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
