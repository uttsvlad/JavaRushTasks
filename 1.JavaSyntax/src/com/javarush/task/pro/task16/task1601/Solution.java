package com.javarush.task.pro.task16.task1601;

import java.util.Date;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(105, 6, 2);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        int dateFormat = date.getDay();
        switch (dateFormat){
            case (1):
                return "Понедельник";
            case (2):
                return "Вторник";
            case (3):
                return "Среда";
            case (4):
                return "Четверг";
            case (5):
                return "Пятница";
            case (6):
                return "Суббота";
            case (0):
                return "Воскресенье";
        }
        return null;
    }
}
