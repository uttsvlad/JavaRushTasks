package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/


public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        Month[] months = new Month[3];
        for (int i = 0; i < 2; i++) {
            months[i] = values()[i];
        }
        months[2] = values()[11];
        return months;
    }

    public static Month[] getSpringMonths() {
        Month[] months = new Month[3];
        for (int i = 0; i < 3; i++) {
            months[i] = values()[i + 2];
        }
        return months;
    }

    public static Month[] getSummerMonths() {
        Month[] months = new Month[3];
        for (int i = 0; i < 3; i++) {
            months[i] = values()[i + 5];
        }
        return months;
    }

    public static Month[] getAutumnMonths() {
        Month[] months = new Month[3];
        for (int i = 0; i < 3; i++) {
            months[i] = values()[i + 8];
        }
        return months;
    }
}
