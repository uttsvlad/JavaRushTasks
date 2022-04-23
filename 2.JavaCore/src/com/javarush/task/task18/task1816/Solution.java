package com.javarush.task.task18.task1816;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) {
        final char[] ENG_LETTERS = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'
                , 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
                , 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'
                , 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] chars = new char[1000];

        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready())
                fileReader.read(chars);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int count = 0;
        for (char c : ENG_LETTERS) {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == c)
                    count++;
            }
        }
        System.out.println(count);
    }
}
