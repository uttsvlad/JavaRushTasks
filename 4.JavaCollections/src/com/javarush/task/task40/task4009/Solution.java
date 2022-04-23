package com.javarush.task.task40.task4009;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* 
Buon Compleanno!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeekdayOfBirthday("02.07.2002", "2022"));
    }

    public static String getWeekdayOfBirthday(String birthday, String year) {
        DateTimeFormatter birthdayDateFormat = DateTimeFormatter.ofPattern("d.M.y");
        LocalDate birthdayDate = LocalDate.parse(birthday, birthdayDateFormat);

        DateTimeFormatter yearFormat = DateTimeFormatter.ofPattern("y");
        Year yearDate = Year.parse(year, yearFormat);

        return birthdayDate.withYear(yearDate.getValue()).format(DateTimeFormatter.ofPattern("EEEE").withLocale(Locale.ITALIAN));
    }
}
