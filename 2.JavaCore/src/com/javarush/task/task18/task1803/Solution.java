package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Самые частые байты
C:\Games\RE8V\AkConvolutionReverb.dll
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(bf.readLine());
        int count = 0;
        ArrayList<Integer> counts = new ArrayList<>();
        ArrayList<Integer> bytes = new ArrayList<>();
        while (fis.available() > 0)
            bytes.add(fis.read());
        for (int i = 0; i < bytes.size(); i++) {
            count = 0;
            for (int j = i + 1; j < bytes.size(); j++) {
                if (bytes.get(i) == bytes.get(j))
                    count++;
            }
            counts.add(count);
        }
        fis.close();
        bf.close();
        int max = counts.stream().max(Integer::compare).get();
        for (int i = 0; i < bytes.size(); i++) {
            count = 0;
            for (int j = i + 1; j < bytes.size(); j++) {
                if (bytes.get(i) == bytes.get(j))
                    count++;
            }
            if (count==max)
                System.out.print(bytes.get(i)+" ");
        }

    }
}
