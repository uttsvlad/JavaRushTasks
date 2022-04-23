package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        ArrayList<String> fromFile = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {
            while (bufferedReader.ready())
                fromFile.add(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String forPerson : fromFile) {
            String[] buf = forPerson.split(" ");
            String personName = "";
            int day = Integer.parseInt(buf[buf.length - 3]);
            int month = Integer.parseInt(buf[buf.length - 2])-1;
            int year = Integer.parseInt(buf[buf.length - 1]);
            for (int i = 0; i < buf.length - 3; i++) {
                personName = personName.concat(buf[i]+" ");
            }
            GregorianCalendar date = new GregorianCalendar(year, month, day);
            PEOPLE.add(new Person(personName.trim(), date.getTime()));


        }
        for (Person p : PEOPLE) {
            System.out.println(p.getName() + " " + p.getBirthDate());
        }
    }
}
