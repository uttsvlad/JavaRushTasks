package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;

/* 
Почитать в инете про медиану выборки
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static Integer[] sort(Integer[] array) {
        final double median = getMedian(array);

        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                double v1 = o1 - median;
                double v2 = o2 - median;
                return (int) ((v1 * v1 - v2 * v2)*100);
            }
        });
        return array;
    }

    public static double getMedian(Integer[] array) {
        Arrays.sort(array);
        double median;
        if (array.length % 2 == 1)
            median = array[array.length / 2];
        else
            median = (array[array.length / 2 - 1] + array[array.length / 2]) / 2;
        return median;
    }
}
