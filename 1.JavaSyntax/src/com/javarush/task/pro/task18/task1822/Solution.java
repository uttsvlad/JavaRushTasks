package com.javarush.task.pro.task18.task1822;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/* 
Из потока данных в список
*/

public class Solution {

    public static void main(String[] args) {
        var numbers = Stream.of(-1, 10, 43, 0, -32, -4, 22);
        ArrayList<Integer> integerArrayList = (ArrayList<Integer>) getPositiveNumbers(numbers);
        integerArrayList.forEach(System.out::println);
    }

    public static List<Integer> getPositiveNumbers(Stream<Integer> numbers) {
        return numbers.filter(num -> num > 0).collect(toList());
    }
}
